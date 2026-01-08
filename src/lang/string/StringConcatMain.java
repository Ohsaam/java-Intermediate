package lang.string;

public class StringConcatMain {
    
    public static void main(String[] args) {
        String a = "hello"; // x001
        String b = "java"; // x002

        String result = a.concat(b);
        String result2 = a + b; 
        // 1. 참조값끼리 더하는 건 불가능 함
        // 2. 근데 어떻게 문자열이 더해지지?
        // 3. 자바 컴파일러가 + 연산자를 만나면 내부적으로 StringBuilder를 사용해서
        //    문자열을 더하는 코드를 만들어 줌 
        //    -> StringBuilder의 append 메서드를 사용해서 문자열을 더함



    }
}
