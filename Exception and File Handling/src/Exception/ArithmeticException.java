package Exception;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dividing the given numbers....");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();

        try {
           int div = first/second;
            System.out.printf("The division is %d %n",div);
        } catch (java.lang.ArithmeticException e){
            System.out.printf("The exception is %s %n",e.getMessage());
        }
        finally {
            System.out.println("Please come again.");
        }
    }
}
