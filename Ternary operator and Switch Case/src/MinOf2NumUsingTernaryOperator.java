import java.util.Scanner;

public class MinOf2NumUsingTernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Finding the Minimum of two number using Ternary Operator...");
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();

        MinOf2NumUsingTernaryOperator obj = new MinOf2NumUsingTernaryOperator();
        int min = obj.min(num1, num2);
        System.out.println(min + " is the minimum number.");

    }

    public int min(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }
}
