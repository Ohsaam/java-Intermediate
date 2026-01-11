package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello Java! Welcome to Java";

        System.out.println("원본 문자열: '" + str + "'");
        System.out.println("replace() 적용 후: '" + str.replace("Java", "Java SE") + "'");
        System.out.println("substring() 적용 후: '" + str.substring(6, 10) + "'");
        System.out.println("Java를 'World'로 변경 후: '" + str.replace("Java", "World") + "'");
        
    }
}
