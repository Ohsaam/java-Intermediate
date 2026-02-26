package enumration.test1;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("HTTP 상태 코드를 입력하세요: ");
        int inputCode = sc.nextInt();
        HttpStatus httpStatus = HttpStatus.findByCode(inputCode);
     }
}
