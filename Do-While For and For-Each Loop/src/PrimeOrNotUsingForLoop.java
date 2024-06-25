import java.util.Scanner;

public class PrimeOrNotUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking the given number is Prime or Not Using For Loop...");
        System.out.print("Enter a number to Check : ");
        int num = input.nextInt();
        System.out.println("Your number is " + (isPrime(num) ? "Prime." : "Not Prime."));
    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
