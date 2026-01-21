package lang.system;

public class SystemMain {
    public static void main(String[] args) {
        
        // 현재 시간을 밀리초로 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis: " + currentTimeMillis);

        // 현재 시간을 나노초로 가져온다
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano: " + currentTimeNano);

        // 환경 변수를 읽어온다
        System.out.println("getEnv = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("os.name: " + System.getProperty("os.name"));

        // 자바 버전
        System.out.println("java.version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originamlArray = new char[]{'a', 'b', 'c', 'd', 'e'};
        char[] copiedArray = new char[5];
        System.arraycopy(originamlArray, 0, copiedArray, 0, originamlArray.length);
        System.out.println("copiedArray: " + java.util.Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        

    }
}
