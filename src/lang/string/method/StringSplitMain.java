package lang.string.method;

public class StringSplitMain {
    public static void main(String[] args) {
        String str = "apple,banana,cherry,date";
        String[] fruits = str.split(",");

        System.out.println("원본 문자열: '" + str + "'");
        System.out.println("split() 적용 후:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : " + strCharArray);
        for (char a : strCharArray) {
            System.out.print(a + " ");
        }
        
    }
}
