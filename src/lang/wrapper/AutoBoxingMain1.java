package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        //primitive type -> Wrapper class (Auto Boxing)
        int value = 7;
        Integer boxInteger = Integer.valueOf(value);
        System.out.println("boxInteger: " + boxInteger); // 7
        
        //Wrapper class -> primitive type (Auto UnBoxing)
        int unboxedValue = boxInteger.intValue();
        System.out.println("unboxedValue: " + unboxedValue); // 7

    }
}
