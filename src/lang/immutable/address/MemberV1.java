package lang.immutable.address;

import java.lang.reflect.Member;

public class MemberV1 {
    private String name;
    private Address address;

    MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
