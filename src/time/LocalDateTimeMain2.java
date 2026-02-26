package time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeMain2 {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2024, 6, 1, 14, 30, 0);
        System.out.println("현재 날짜와 시간: " + nowDt);
        System.out.println("지정한 날짜와 시간: " + ofDt);

        // 날짜와 시간을 분리
        System.out.println("날짜 부분: " + ofDt.toLocalDate());
        System.out.println("시간 부분: " + ofDt.toLocalTime());

        //날짜와 시간 합체
        LocalDateTime localDateTime = ofDt.toLocalDate().atTime(ofDt.toLocalTime());
        System.out.println("합체한 날짜와 시간: " + localDateTime);

        LocalDateTime localDateTime2 = ofDt.toLocalDate().atTime(15, 45, 0);
        System.out.println("합체한 날짜와 시간2: " + localDateTime2);

        
    }
}
