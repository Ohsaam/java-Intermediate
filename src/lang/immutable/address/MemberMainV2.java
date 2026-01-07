package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutubleAddress addr1 = new ImmutubleAddress("서울"); 

        MemberV2 member1 = new MemberV2("회원A", addr1);
        MemberV2 member2 = new MemberV2("회원B", addr1);

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);


        // 회원B의 주소를 처음 주소로 설정 해야 됨 
        //member2.getAddress().setValue("부산");
        member2.setImmutubleAddress(new ImmutubleAddress("부산"));
        System.out.println("주소 변경 후...");
        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);
    }
}
