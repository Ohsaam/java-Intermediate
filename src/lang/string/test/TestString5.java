package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".tex";
        int extIndex = str.indexOf(ext);
        
        String fileName = str.substring(0, extIndex);
        System.out.println("File Name without extension: " + fileName);

        String extName = str.substring(extIndex);
        System.out.println("Extension Name: " + extName);

    }
}
