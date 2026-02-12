package enumration.ex1;

public class DiscountService {
    
    public int discount(String grade, int price) {
        int discountPrice = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPrice = (int)(price * 0.05);
        } else if (grade.equals(StringGrade.GOLD)) {   
            discountPrice = (int)(price * 0.1);
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPrice = (int)(price * 0.15);
        } else {
            discountPrice = 0;
        }

        return price * discountPrice / 100;
    }
}
