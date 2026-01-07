package lang.immutable.address;

public class PrimitivieMain {
    // 기본형은 절대 같은 값을 공유하지 않는다.

    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b );
        
    }
}
