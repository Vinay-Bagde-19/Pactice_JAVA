import java.util.Scanner;

public class Bitwise_AND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Showcasing the bitwise AND operator...");
        System.out.print("Enter first number : ");
        int first = input.nextInt();
        System.out.print("Enter second number : ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("The Bitwise AND of, " + first + " and " + second + " is : " + result);
    }
}
