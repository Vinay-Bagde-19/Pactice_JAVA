import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check +ve, -ve or zero....  : ");
        int number = input.nextInt();
        if (number > 0){
            System.out.println("The entered nummber is Positive (+).");
        } else if (number < 0) {
            System.out.println("The entered number is Negative (-). ");
        }else {
            System.out.println("The entered nummber is Zero (0). ");
        }

    }
}
