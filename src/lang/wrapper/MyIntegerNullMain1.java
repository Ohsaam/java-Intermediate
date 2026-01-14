package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intarr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3)};
        System.out.println(findValue(intarr, -1));
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for(MyInteger myInt : intArr) {
            if (myInt.getValue() == target) {
                return myInt;
            }
        }
        return null;
    }
}
