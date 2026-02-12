package enumration.ex2;

public class DisCountService {
    public int discount(ClassGrade grade, int price) {
        int discountPrice = 0;

        if (grade == ClassGrade.BASIC) {
            discountPrice = (int)(price * 0.05);
        } else if (grade == ClassGrade.GOLD) {   
            discountPrice = (int)(price * 0.1);
        } else if (grade == ClassGrade.DIAMOND) {
            discountPrice = (int)(price * 0.15);
        } else {
            discountPrice = 0;
        }

        return price * discountPrice / 100;
    }
}
