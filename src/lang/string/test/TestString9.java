package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "ohjihwan123@naver.com";
        String[] parts = email.split("@");
        String userId = parts[0];
        String domain = parts[1];
        System.out.println("User ID: " + userId);
        System.out.println("Domain: " + domain);
    }
}
