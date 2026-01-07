package lang.object.equals;

public class EqualsMain {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("userA");
        UserV1 user2 = new UserV1("userA");

        System.out.println(user1 == user2); // false (참조 비교)
        System.out.println(user1.equals(user2)); // false (참조 비교)
    }
}
