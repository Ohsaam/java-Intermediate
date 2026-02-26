package enumration.test1;

public class AuthGradeMain {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            System.out.println("authGrade: " + authGrade + ", ordinal: " + authGrade.ordinal());
        }

    }
}
