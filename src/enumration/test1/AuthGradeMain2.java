package enumration.test1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("등급을 입력하세요 (BASIC, SILVER, GOLD): ");
        String inputGrade = sc.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(inputGrade.toUpperCase());
        System.out.println("입력한 등급: " + authGrade);
        
    }
}
