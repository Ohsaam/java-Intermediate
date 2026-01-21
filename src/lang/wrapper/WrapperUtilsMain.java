package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer l1 = Integer.valueOf(10);
        Integer l2 = Integer.valueOf("10");
        Integer l3 = Integer.parseInt("10");

        int compareResult = l1.compareTo(l3);
        System.out.println("compareResult: " + compareResult); // 0
    }   
}
