import java.util.Scanner;

public class UseOfFinalKeyword {
    final double pi = Math.PI;
    double radius;

    UseOfFinalKeyword(double radius){
        this.radius =radius;
    }

     double getCircumference(){
        return  2 * this.pi * radius;
     }

     double getArea(){
        return this.pi * Math.pow(radius,2);
     }

     public String toString(){
        return "Circle Props : Radius in mm : " + radius
                + " , Circumference in mm : " + getCircumference()
                + " , Area in mm2: " + getArea();
     }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your radius : ");
        double radius = input.nextDouble();
        UseOfFinalKeyword circle = new UseOfFinalKeyword(radius);
        System.out.println(circle);
    }
}
