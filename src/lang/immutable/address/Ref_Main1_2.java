package lang.immutable.address;

public class Ref_Main1_2 {
    
    public static void main(String[] args) {
        ImmutubleAddress addr1 = new ImmutubleAddress("서울");
        ImmutubleAddress addr2 = addr1; // 참조값을 막을 순 없음

        System.out.println("addr1 = " + addr1);
        System.out.println("addr2 = " + addr2);
    }
}
