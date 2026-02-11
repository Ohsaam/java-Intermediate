package enumration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int discountPrice = discountService.discount("BASIC", price);
        System.out.println("BASIC 등급 할인 금액: " + discountPrice);

        discountPrice = discountService.discount("SILVER", price);
        System.out.println("SILVER 등급 할인 금액: " + discountPrice);

        discountPrice = discountService.discount("GOLD", price);
        System.out.println("GOLD 등급 할인 금액: " + discountPrice);
    }
}
