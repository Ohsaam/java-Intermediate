package enumration.test1;

public enum AuthGrade {
    GUEST(1,"손님"), LOGIN(2,"로그인"), ADMIN(3,"관리자");

    private final int level;
    private final String desciption;

    AuthGrade(int level, String desciption) {
        this.level = level;
        this.desciption = desciption;
    }

}
