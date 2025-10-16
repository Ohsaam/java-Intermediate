package lang.poly;

public class ObjectPolyExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        
        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // 객체에 맞는 다운캐스팅이 필요함
        if (obj instanceof Dog) { 
            Dog dog = (Dog) obj;
            dog.sound();
        } else if (obj instanceof Car) {
            Car car = (Car) obj;
            car.move();
        }
       
    }
}
