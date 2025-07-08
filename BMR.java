import java.util.Scanner;

public class BMR {

    public static double calculateBMR(double weight, double height, int age, String gender) {
        if (gender.equalsIgnoreCase("male")) {
            return 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else if (gender.equalsIgnoreCase("female")) {
            return 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMR");

        System.out.print("Weight : ");
        double weight = scanner.nextDouble();

        System.out.print("Height : ");
        double height = scanner.nextDouble();

        System.out.print("Age : ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Please select gender (male/female): ");
        String gender = scanner.nextLine();

        double bmr = calculateBMR(weight, height, age, gender);

        if (bmr == -1) {
            System.out.println("Showing ability instead of putting 'male' or 'female' in the rest");
        } else {
            System.out.printf("BMR: %.2f kilocalories/Day\n", bmr);
        }

        scanner.close();
    }
}
