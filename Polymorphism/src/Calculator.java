public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a,int b,int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(5, 10));
        System.out.println(cal.add(10,5,15));
        System.out.println(cal.add(15.5,4.5));
    }
}
