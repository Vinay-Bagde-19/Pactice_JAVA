import java.util.Scanner;

public class Palindrome_Check {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Showcasing the number is palindrome or not ... \n");
    System.out.print("Enter a number : ");
    int num = input.nextInt();

    boolean isPalindrome = isPalindrome(num);
    if(isPalindrome){
        System.out.println("The number is Palindrome.");
        }else{
            System.out.println("The number is not a Palindrome.");
        }

    }

    public static boolean isPalindrome(int num){
        int check = num;
        int reverse = 0;
        while (num >= 1) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return check == reverse;
    }
}
