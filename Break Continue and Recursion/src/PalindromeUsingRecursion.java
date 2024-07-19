import java.util.Scanner;

public class PalindromeUsingRecursion {
    public static boolean isPalindrome(String str){
        if (str.length() <= 1) {
            return true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }
        String newStr = str.substring(1, lastPos);    // this string will start from index 1 of string and go till lastPos-1
        return isPalindrome(newStr);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Checking the given String is Palindrome or not Using Recursion....");
        System.out.print("Enter the String to check : ");
        String str = input.next();
        System.out.println("Your String is "+ (isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
    }
}
