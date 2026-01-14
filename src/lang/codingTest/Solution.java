package lang.codingTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    
    public List<Integer> solution(int[][] original, int[][] compare) {
        Map<Integer, String> originPaths = bfs(original);
        Map<Integer, String> comparePaths = bfs(compare);
        
        Set<Integer> result = new TreeSet<>();
        
        for (int node : originPaths.keySet()) {
            String originPath = originPaths.get(node);
            String comparePath = comparePaths.get(node);
            
            if (!originPath.equals(comparePath)) {
                result.add(node);
            }
        }
        
        return new ArrayList<>(result);
    }
    
    private Map<Integer, String> bfs(int[][] edges) {
        Map<Integer, List<Integer>> tree = new HashMap<>();
        Set<Integer> allNodes = new HashSet<>();
        Set<Integer> childNodes = new HashSet<>();
        
        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];
            
            if (!tree.containsKey(parent)) {
                tree.put(parent, new ArrayList<>());
            }
            tree.get(parent).add(child);
            
            allNodes.add(parent);
            allNodes.add(child);
            childNodes.add(child);
        }
        
        Integer root = null;
        for (int node : allNodes) {
            if (!childNodes.contains(node)) {
                root = node;
                break;
            }
        }
        
        Map<Integer, String> paths = new HashMap<>();
        if (root == null) {
            return paths;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        paths.put(root, root.toString());
        
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            
            if (!tree.containsKey(curr)) {
                continue;
            }
            
            String currPath = paths.get(curr);
            
            for (int child : tree.get(curr)) {
                StringBuilder childPath = new StringBuilder(currPath);
                childPath.append("-").append(child);
                
                paths.put(child, childPath.toString());
                queue.offer(child);
            }
        }
        
        return paths;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] original = {{1,2}, {1,3}, {3,4}, {3,5}, {3,6}};
        int[][] compare = {{1,2}, {1,5}, {2,3}, {3,4}, {5,6}};
        
        System.out.println(sol.solution(original, compare)); 
    }
}
