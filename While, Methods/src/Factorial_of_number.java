import java.util.Scanner;

public class Factorial_of_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to find the factorial of : ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("The Factorial of the given number " + num + " is : " + fact);
    }

    public static long factorial (int num){
        if (num < 2){
            return 1;
        }

        int fact = 1;
        while (num >= 1){
                fact = fact * num;
                num--;
        }
        return fact;
    }
}
