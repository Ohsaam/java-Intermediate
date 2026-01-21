package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수
        long startTime, endTime; 

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("기본형 long 사용 시간: " + (endTime - startTime) + "ms");
        System.out.println("기본형 long 합계: " + sumPrimitive);

        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // AutoBoxing, AutoUnboxing 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("래퍼 타입 Long 사용 시간: " + (endTime - startTime) + "ms");
        System.out.println("래퍼 타입 Long 합계: " + sumWrapper);
    }
}
