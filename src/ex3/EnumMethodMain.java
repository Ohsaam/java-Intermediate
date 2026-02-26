package ex3;

public class EnumMethodMain {
    
    public static void main(String[] args) {
        Grade[] grades = Grade.values();
        System.out.println("grades" + grades);

        for (Grade grade : grades) {
            System.out.println("grade: " + grade + ", ordinal: " + grade.ordinal());
        }

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("input: " + input + ", gold: " + gold);
    }
}
