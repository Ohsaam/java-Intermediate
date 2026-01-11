package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str1 = "hello";
        str1.concat(" world");
        System.out.println("str1 = " + str1); 
        // 왜 합쳐지지 않았을까? > 불변 객체기 때문에

        // 사용하려면 아래와 같이 사용해야 된다.
        String str2 = str1.concat(" world");
        System.out.println("str2 = " + str2);

    }
    
}
