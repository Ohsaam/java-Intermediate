package lang.object;

// 명시적으로 상속 받기 때문에 Object를 상속받지 않는다.
public class Child extends Parent { 
    public void childMethod() {
        System.out.println("This is a method in the Child class.");
    }
}
