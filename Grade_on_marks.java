import java.util.Scanner;

public class Grade_on_marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Percentage for determining grade : ");
        float percent = input.nextFloat();

        if (percent >= 90){
            System.out.println("The grade is A");
        }else if (percent >= 75){
            System.out.println("The grade is B");
        }else if (percent >= 60){
            System.out.println("The grade is C");
        }else if (percent >= 30){
            System.out.println("The grade is D");
        }else{
            System.out.println("The grade is E");
        }
    }
}
