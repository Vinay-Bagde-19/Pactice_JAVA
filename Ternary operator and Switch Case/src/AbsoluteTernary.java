import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Giving the Absolute value using Ternary Operator...");
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int result = num >=0  ? num : -num;
        System.out.println("The Absolute value is " + result);
    }
}
