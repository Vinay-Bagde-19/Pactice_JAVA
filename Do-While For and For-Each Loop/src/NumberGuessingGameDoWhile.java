import java.util.Scanner;

class NumberGuessingGameDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess;
        System.out.println("Welcome to the number guessing game....");
        do {
            System.out.print("Please guess the number between 0 to 10 : ");
            guess = input.nextInt();
        }while (num != guess);
        System.out.println("You have sucessfully guessed the number.");
    }
}
