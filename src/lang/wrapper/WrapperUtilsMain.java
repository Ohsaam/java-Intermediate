package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer l1 = Integer.valueOf(10);
        Integer l2 = Integer.valueOf("10");
        Integer l3 = Integer.parseInt("10");

        // 비교
        int compareResult = l1.compareTo(l3);
        System.out.println("compareResult: " + compareResult); // 0
        
        // 산술 연산
        System.out.println("sum: " + Integer.sum(l1, l2, l3)); // 30
    }   
}
