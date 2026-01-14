package lang.codingTest;

public class CodingTest {

    /**
     * [방식 1] 반복문
     */    
    public int solution1(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

     /**
     * [방식 2] 재귀호출
     */
    public int solution2(int n) {
        if (n <= 0) // 종료 조건
            return 0;
        
        if (n % 2 == 1) { // n이 홀수 일 때 
            return n + solution2(n - 1);
        } 

        return solution2(n - 1); // n이 짝수 일 때 
    }

     /**
     * [방식 3] 수학 공식: 홀수 합 = (홀수 개수)²
     */
    public int solution3(int n) {
        int count = (n + 1) / 2;  
        return count * count;   
    }
    public static void main(String[] args) {
        CodingTest sol = new CodingTest();
        
        System.out.println("solution1: " + sol.solution1(7));  // 16
        System.out.println("solution2: " + sol.solution2(7));  // 16
        System.out.println("solution3: " + sol.solution3(7));  // 16
    }
}
