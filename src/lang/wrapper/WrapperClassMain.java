package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        System.out.println("newInteger: " + newInteger); // 10 toString를 오버라이딩 하고 있음

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(3.14);

        System.out.println("longObj: " + longObj); // 100
        System.out.println("doubleObj: " + doubleObj); // 3.14

        int intValue = newInteger.intValue();
        System.out.println("intValue: " + intValue); // 10

        Long longValue = Long.valueOf(longObj.longValue());
        System.out.println("longValue: " + longValue); // 100

        

    }
}
