import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Finding the GCD of the given two numbers....");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int gcd = gcd(first,second);
        System.out.println("The Greatest Common Divisor of the numbers is : " + gcd);
    }

    public static int gcd(int num1 ,int num2){
        int gcd = 1;
        int least = smallest(num1,num2);
        while (least > 1){
            if (num1 % least == 0 && num2 % least == 0){
                return least;
            }
            least--;
        }
        return gcd;
    }

    public static int smallest(int num1, int num2){
        if (num1 > num2){
            return num1;
        }
        return num2;
    }
}
