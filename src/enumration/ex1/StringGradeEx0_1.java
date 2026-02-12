package enumration.ex1;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int discountPrice = discountService.discount(StringGrade.BASIC, price);
        System.out.println("BASIC 등급 할인 금액: " + discountPrice);

        discountPrice = discountService.discount(StringGrade.DIAMOND, price);
        System.out.println("SILVER 등급 할인 금액: " + discountPrice);

        discountPrice = discountService.discount(StringGrade.GOLD, price);
        System.out.println("GOLD 등급 할인 금액: " + discountPrice);
    }
}
