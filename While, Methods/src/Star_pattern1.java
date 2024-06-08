public class Star_pattern1 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i <= 5){
            System.out.println("* ");
                while (i >= j){
                    System.out.print("* ");
                    j++;
            }
            i++;
        }
    }
}
