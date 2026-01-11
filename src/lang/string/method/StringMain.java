package lang.string.method;

public class StringMain {
    public static void main(String[] args) {
        String str = " Hello World ";
        System.out.println("원본 문자열: '" + str + "'");
        System.out.println("trim() 적용 후: '" + str.trim() + "'");
        System.out.println("toUpperCase() 적용 후: '" + str.toUpperCase() + "'");
        System.out.println("toLowerCase() 적용 후: '" + str.toLowerCase() + "'");
        System.out.println("replaceAll() 적용 후: '" + str.replaceAll(" ", "") + "'");

    }
}
