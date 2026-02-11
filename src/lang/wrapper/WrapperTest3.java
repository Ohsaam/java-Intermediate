package lang.wrapper;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer1 = Integer.valueOf(str); 


        int intValue = integer1.intValue();
        System.out.println("intValue: " + intValue); // 100


        Integer integer2 = Integer.parseInt(str);
        System.out.println("integer2: " + integer2); // 100

    }
}
