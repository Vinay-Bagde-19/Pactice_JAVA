import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        System.out.println("Calculating Area of a Triangle....");
        System.out.print("Enter Base of the Triangle in cm: ");
        double base = val.nextDouble();
        System.out.print("Enter Height of the Triangle in cm: ");
        double height = val.nextDouble();
        double Area = (base * height)/2;
        System.out.print("The Area of the Triangle is : " + Area + "cm2");
    }
}
