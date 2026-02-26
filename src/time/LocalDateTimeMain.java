package time;

import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간: " + nowTime);
        LocalTime ofTime = LocalTime.of(14, 30, 0);
        System.out.println("지정한 시간: " + ofTime);

        //계산 (불변)
        ofTime = ofTime.plusHours(2).plusMinutes(15);
        System.out.println("계산 후 시간: " + ofTime);
    }
}
