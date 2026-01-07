package lang.immutable.test;

public class MyDataMain {
    public static void main(String[] args) {
        MyData data1 = new MyData(2024, 6, 10);
        MyData data2 = new MyData(2024, 6, 10);

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

        data1.setMonth(2025);
        System.out.println("=== After modifying data1 ===");
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
    }

}
