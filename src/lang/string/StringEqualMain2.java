package lang.string;

public class StringEqualMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1 == str2 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 str3 == str4 : " + isSame(str3, str4));

    }

    private static boolean isSame(String x, String y) {
        
        // return x == y;
        // 1. 문자열 비교는 절대 ! == 연산자 사용하지 말 것.
        // 2. 참조값이 아닌 실제 문자열 값이 같은지 비교해야 함.

        return x.equals(y);
    }
}
