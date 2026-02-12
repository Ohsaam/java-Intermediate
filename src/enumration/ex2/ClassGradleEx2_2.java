package enumration.ex2;

public class ClassGradleEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DisCountService discountService = new DisCountService();
        ClassGrade newClassGrade = new ClassGrade();
        int result = discountService.discount(newClassGrade, price);
        System.out.println("등급 없음 할인 금액: " + result);
    }
}
