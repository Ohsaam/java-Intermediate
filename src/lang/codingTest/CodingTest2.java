package lang.codingTest;
public class CodingTest2 {
    
    public String solution(String str) {
        if (str == null || str.isEmpty())
            return str;

        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        CodingTest2 sol = new CodingTest2();
        System.out.println(sol.solution("hello"));
    }
}
