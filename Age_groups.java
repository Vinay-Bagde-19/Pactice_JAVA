
import java.util.Scanner;

public class Age_groups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age to check your age group : ");
        int age = input.nextInt();
//        if (age < 13){
//            System.out.println("your age group is Child.");
//        } else if (age < 20 && age > 13) {
//            System.out.println("Your age group is Teen.");
//        } else if (age < 60 && age > 20) {
//            System.out.println("Your age group is Adult.");
//        }else {
//            System.out.println("Your age group is Senior.");
//        }

        if (age > 60){
            System.out.println("Your age group is Senior citizen.");
        }else if (age > 20){
            System.out.println("Your age group is Adult.");
        } else if (age > 13) {
            System.out.println("Your age group is Teen.");
        }else{
            System.out.println("your age group is Child.");
        }
    }
}
