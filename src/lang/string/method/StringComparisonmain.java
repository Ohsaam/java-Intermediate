package lang.string.method;

public class StringComparisonmain {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        String str3 = "hello world";

        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str2.equals(str3): " + str2.equals(str3)); // true

        System.out.println("str1 == str2: " + (str1 == str2)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false

        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); 
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); 
        System.out.println("str2.compareTo(str3): " + str2.compareTo(str3)); 
    }
}
