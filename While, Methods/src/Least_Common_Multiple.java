import java.util.Scanner;

class Least_Common_Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Finding the LCM of the given two numbers....");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("The LCM of the two numbers is: " + lcm);
    }

    public static int lcm(int first,int second){
        int i = 1;
        while (i <= second){       // here the loop will run till second number. eg. if second is 15 it will go till 15
            int factor = first * i;             // here from above eg. start from first * 1 till first * 15
            if (factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0;  // Unreachable
    }
}
