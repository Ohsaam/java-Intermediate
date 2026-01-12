package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com/search?query=java+programming&sort=asc";
        boolean result = url.contains("query=");
        System.out.println("URL contains 'query=': " + result);
    }
}
