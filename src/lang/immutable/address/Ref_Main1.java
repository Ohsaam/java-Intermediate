package lang.immutable.address;

public class Ref_Main1 {
    
    public static void main(String[] args) {
        Address addr1 = new Address("서울");

        Address addr2 = addr1;

        System.out.println("addr1 = " + addr1);
        addr2.setValue("부산");
        System.out.println("addr2 = " + addr2);
    }
}
