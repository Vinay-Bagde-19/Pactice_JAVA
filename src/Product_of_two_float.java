import java.util.Scanner;

public class Product_of_two_float {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num1 , num2 , multi;

        System.out.println("Enter two float values for Multiplication: \n");
        num1 = input.nextFloat();
        num2 = input.nextFloat();
        multi = num1 * num2;

        System.out.println("Multiplication is given by: " + multi);
    }
}
