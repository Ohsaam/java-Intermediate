package lang.immutable.address;

public class Ref_Main2 {
    
    public static void main(String[] args) {
        Address addr1 = new Address("서울"); // x001
        Address addr2 = new Address("서울"); // x002

        System.out.println("addr1 = " + addr1);
        System.out.println("addr2 = " + addr2);

        printAddress(addr2,"부산");
        System.out.println("addr1 = " + addr1);
        System.out.println("addr2 = " + addr2);

    }
    
    private static void printAddress(Address addr, String changeAddress) {
        System.out.println("주소 값을 변경합니다. => " + changeAddress);
        addr.setValue(changeAddress);
        System.out.println("변경된 주소 값: " + addr);
    }
}
