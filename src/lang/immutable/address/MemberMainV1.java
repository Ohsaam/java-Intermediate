package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address addr1 = new Address("서울"); 

        MemberV1 member1 = new MemberV1("회원A", addr1);
        MemberV1 member2 = new MemberV1("회원B", addr1);

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);

        member2.getAddress().setValue("부산");
        System.out.println("주소 변경 후...");
        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);
    }
}
