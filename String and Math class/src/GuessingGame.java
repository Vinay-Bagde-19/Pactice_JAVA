import java.util.Scanner;

public class GuessingGame {
    int random;

    GuessingGame(){
        random = (int) Math.ceil(Math.random() * 100);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guessing the Number Game...");
        GuessingGame obj = new GuessingGame();

        System.out.print("Please enter a number between 0 to 100 to start guessing: ");
        float guess = input.nextFloat();
        int count = 1;

        if(guess == obj.random){
            System.out.println("You have guessed the number in first attempt.");
        } else {
            while (guess != obj.random){
                count++;
                if (obj.random < guess){
                    System.out.println("Please guess Smaller Number ");
                    System.out.print("Guess the number : ");
                    guess = input.nextFloat();
                } else if (obj.random > guess){
                    System.out.println("Please guess Larger Number ");
                    System.out.print("Guess the number : ");
                    guess = input.nextFloat();
                }
            }
                System.out.println("Congratulation!! You have guessed the number in "+ count +" guesses.");
        }

    }
}
