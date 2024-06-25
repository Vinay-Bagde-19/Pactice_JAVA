import java.util.Scanner;

public class PasswordCheckerUsingDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Password Checker...");
        int password = 123456;
        int EnteredPassword;
        do {
            System.out.println("Please enter Password : ");
            EnteredPassword = input.nextInt();
        }while (password != EnteredPassword);

        System.out.println("Password matched, Welcome");
    }
}
