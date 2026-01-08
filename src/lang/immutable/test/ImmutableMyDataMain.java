package lang.immutable.test;

public class ImmutableMyDataMain {
    public static void main(String[] args) {
        ImmutableMyData data1 = new ImmutableMyData(2024, 6, 10);
        ImmutableMyData data2 = data1;

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

        data1 = data1.setMonth(2025);
        System.out.println("=== After modifying data1 ===");
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
    }

}
s