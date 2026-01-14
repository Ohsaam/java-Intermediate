package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        //primitive type -> Wrapper class (Auto Boxing)
        int value = 7;
        Integer boxInteger = value; // 자바에서 자동으로 해주는 것을 오토박싱
        System.out.println("boxInteger: " + boxInteger); // 7
        
        //Wrapper class -> primitive type (Auto UnBoxing)
        int unboxedValue = boxInteger; // 오토 언박싱
        System.out.println("unboxedValue: " + unboxedValue); // 7

    }
}
