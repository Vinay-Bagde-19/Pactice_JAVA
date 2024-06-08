import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Finding the given number is Armstrong or not ....");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();

        boolean isArmstrong = isArmstrong(first);
       if (isArmstrong){
           System.out.println("Entered number is Armstrong Number.");
       }else {
           System.out.println("Entered number is Not a Armstrong Number.");
       }
    }

    public static boolean isArmstrong(int num) {
        int noDigits = noOfDigites(num);
        int givenNumber = num;
//        System.out.println("No. of digits = " + noDigits);
        int finalNumber = 0;

        while (num > 0){
            int lastDigit = num % 10;
            num = num / 10;
            finalNumber = finalNumber + power(lastDigit,noDigits);
        }
//        System.out.println("Final number is = " + finalNumber);
//        System.out.println("Given number is "+ givenNumber);
        return finalNumber == givenNumber;
    }

    public static int noOfDigites(int num){
        int noDigits = 0;
        while (num > 0){
            num = num / 10;
            noDigits++;
        }
        return noDigits;
    }

    public static int power(int num1,int num2){
        int result = 1;
        int i = 0;
        while (i < num2){
            result = result * num1;
            i++;
        }
//        System.out.println("Power of " + num1 + " is " +num2 +" and result = " +result);
        return result;
    }
}
