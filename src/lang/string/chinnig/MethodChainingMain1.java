package lang.string.chinnig;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(5).add(10).add(15);
        int result = adder.getValue();
        System.out.println("Result after method chaining: " + result);
    }
}
