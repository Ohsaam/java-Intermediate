package enumration.ex0;

public class DiscountService {
    
    public int discount(String grade, int price) {
        int discountPrice = 0;

        if (grade.equals("BASIC")) {
            discountPrice = (int)(price * 0.05);
        } else if (grade.equals("SILVER")) {
            discountPrice = (int)(price * 0.1);
        } else if (grade.equals("GOLD")) {
            discountPrice = (int)(price * 0.15);
        } else {
            discountPrice = 0;
        }

        return price * discountPrice / 100;
    }
}
