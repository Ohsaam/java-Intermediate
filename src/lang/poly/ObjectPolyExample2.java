package lang.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        
        Object obj = new Object();
        Object[] objs = {dog, car, obj};

        size(objs);
    }

    public static void size(Object[] objs) {
        System.out.println("Number of elements: " + objs.length);
    }
    
}
