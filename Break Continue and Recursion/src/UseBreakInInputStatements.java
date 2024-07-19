import java.util.Scanner;

public class UseBreakInInputStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter your Command : ");
            String commInput = input.next();
            if (commInput.equalsIgnoreCase("exit")){  //.equalsIgnoreCase is used to compare two Strings
                break;    //no-matter what the case is it, treat Upper and Lower case same ,and we cannot use ' == '
            }             // to compare the String as it is an Object in Java.
        }
        System.out.println("you have successfully exited.");
    }
}
