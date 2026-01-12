package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String string = sb.append("A").append("B").append("C").toString();
        System.out.println("string = " + string);
    }
    
}
