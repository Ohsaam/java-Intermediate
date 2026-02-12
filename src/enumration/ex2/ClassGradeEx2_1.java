package enumration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;
        DisCountService discountService = new DisCountService();
        int discountPrice = discountService.discount(ClassGrade.BASIC, price);
        System.out.println("BASIC 등급 할인 금액: " + discountPrice);
        discountPrice = discountService.discount(ClassGrade.SILVER, price);
        System.out.println("SILVER 등급 할인 금액: " + discountPrice);
        discountPrice = discountService.discount(ClassGrade.GOLD, price);
        System.out.println("GOLD 등급 할인 금액: " + discountPrice);
    }
}
