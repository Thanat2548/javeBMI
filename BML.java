import java.util.*;

public class BML {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int b;
        int w;
        int h;

        w = input.nextInt();
        h = input.nextInt(); 

        double heightInMeters = h / 100.0;
        double bmi = w / (heightInMeters * heightInMeters);

        if (bmi >= 30) {
            System.out.println("Obese");
        } else if (bmi >= 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }
    }
}