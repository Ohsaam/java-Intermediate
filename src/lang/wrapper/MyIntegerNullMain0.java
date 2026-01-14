package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intarr = {-1, 0 ,1 , 2, 3};
        System.out.println(findValue(intarr, -1));
    }

    private static int findValue(int[] intArr, int target) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
