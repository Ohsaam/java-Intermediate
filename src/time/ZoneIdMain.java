package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId);
            ZoneId zoneIdObj = ZoneId.of("Asia/Seoul");
            System.out.println("서울의 시간대: " + zoneIdObj);
        }
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("시스템 기본 시간대: " + zoneId);

        ZoneId seoulZondId = ZoneId.of("Asia/Seoul");
        System.out.println("서울의 시간대: " + seoulZondId);
        
    }
}
