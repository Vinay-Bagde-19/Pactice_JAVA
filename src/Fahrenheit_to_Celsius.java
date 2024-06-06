import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Converting Fahrenheit to Celsius :");
        System.out.print("Please enter temperature in Fahrenheit : ");
        double fahren = input.nextDouble();
        double celsius = (fahren - 32) * 5/9;
        System.out.println("Temperature in Celsius is : " + celsius + "C");
    }
}
