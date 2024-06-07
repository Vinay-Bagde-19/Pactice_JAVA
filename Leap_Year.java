import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Year to check if it is Leap year or not : ");
        int year = input.nextInt();

        if(year % 4==0 && year % 100!=0){
            System.out.println("The Entered year is a Leap year.");
        }else if(year % 400==0) {
            System.out.println("The Entered year is a Leap year.");
        }
        else{
            System.out.println("The Entered year is not a Leap Year.");
        }
    }
}
