import java.util.Scanner;

public class Print_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for its table...   : ");
        int n = input.nextInt();
        table(n);
    }
    public static void table(int num){
        int i = 1;
        while (i<=10){
            System.out.println(num + " X " + i +" = " + num*i);
            i++;
        }
    }
}
