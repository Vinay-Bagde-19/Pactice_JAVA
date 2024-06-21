import java.util.Scanner;

public class EvenOddUsingTernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Finding the given number is even or odd using Ternary Operator...");
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("The given number is " + result);
    }
}
