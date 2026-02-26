package ex3;

import javax.print.attribute.IntegerSyntax;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("Grade BASIC: " + Grade.BASIC);
        System.out.println("Grade GOLD: " + Grade.GOLD);
        System.out.println("Grade DIAMOND: " + Grade.DIAMOND);

        System.out.println("Grade BASIC ref: " + refValue(Grade.BASIC));
        System.out.println("Grade GOLD ref: " + refValue(Grade.GOLD));
        System.out.println("Grade DIAMOND ref: " + refValue(Grade.DIAMOND));

    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
