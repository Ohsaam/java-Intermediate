package lang.string;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 str3 == str4 : " + (str3 == str4));

        // 1. == 비교를 했는데 왜 참이지? 
        // 2. 자바 컴파일러가 리터럴 문자열은 상수풀에 저장을 함
        
    }
}
