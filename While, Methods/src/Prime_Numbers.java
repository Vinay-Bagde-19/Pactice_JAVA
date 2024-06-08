import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Finding the number is Prime or not...");
        System.out.print("Enter a number to check : ");
        int num = input.nextInt();
        boolean prime = isPrime(num);
        if(prime){
            System.out.println("The number is a Prime number.");
        }else {
            System.out.println("The number is not a prime number.");
        }
    }

    public static boolean isPrime(int n){
        int i = 2;
        while (i < n){
            if (n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
