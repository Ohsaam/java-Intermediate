package lang.immutable.address;

import java.lang.reflect.Member;

import javax.management.ImmutableDescriptor;

public class MemberV2 {
    private String name;
    private ImmutubleAddress immutubleAddress;

    MemberV2(String name, ImmutubleAddress immutubleAddress) {
        this.name = name;
        this.immutubleAddress = immutubleAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImmutubleAddress getImmutubleAddress() {
        return immutubleAddress;
    }

    public void setImmutubleAddress(ImmutubleAddress immutubleAddress) {
        this.immutubleAddress = immutubleAddress;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
