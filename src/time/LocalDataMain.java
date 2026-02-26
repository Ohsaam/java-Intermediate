package time;

import java.time.LocalDate;

public class LocalDataMain {
    
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜: " + nowDate);

        LocalDate ofDate = LocalDate.of(2024, 6, 1);
        System.out.println("지정한 날짜: " + ofDate);

        //계산 (불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("계산 후 날짜: " + ofDate);
    }
}
