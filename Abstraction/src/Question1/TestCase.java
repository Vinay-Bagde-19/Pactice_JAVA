package Question1;

public class TestCase {
    public static void main(String[] args){
//        Shape shape = new Shape();            we can not make object for a abstract class.

        Circle circle = new Circle(5.5);
        Square square = new Square(10.3);

        System.out.printf("Area of Circle is %6.2f\n",circle.calculateArea());
        System.out.printf("Area of Square is %6.2f",square.calculateArea());

    }
}
