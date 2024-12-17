
import java.util.Scanner;
public class Bmicalculatore {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weight and height
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight/(height*height);

        // Display the BMI and category
        System.out.printf("Your BMI is: %.2f%n", bmi);
        if (bmi < 18.5) 
        {
            System.out.println( "Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 24.9)
        {
            System.out.println( "Normal weight");
        } 
        else if (bmi >= 25 && bmi < 29.9) 
        {
            System.out.println( "Overweight");
        } 
        else 
        {
            System.out.println( "Input not matched");
        }
    }
}


    

