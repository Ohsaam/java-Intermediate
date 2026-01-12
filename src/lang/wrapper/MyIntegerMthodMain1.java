package lang.wrapper;

public class MyIntegerMthodMain1 {
    public static void main(String[] args) {
        MyInteger myInt1 = new MyInteger(10);
        int i1 = myInt1.compareTo(5);
        int i2 = myInt1.compareTo(10);
        int i3 = myInt1.compareTo(15);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
