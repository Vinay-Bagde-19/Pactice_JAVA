import java.util.Scanner;

public class Perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A,B,C,D;
        System.out.println("Please enter sides A,B,C,D of rectangle for calculation of Perimeter: \n");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        System.out.println("Perimeter of given rectangle is: " + (A+B+C+D) + "cm");
    }
}
