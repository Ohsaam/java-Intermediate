package lang.string.builder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        sb.insert(4, ",");
        System.out.println("insert = " + sb);

        sb.delete(4,8);
        System.out.println("delete = " + sb);

        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
