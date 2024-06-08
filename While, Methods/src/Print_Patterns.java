import java.util.Scanner;

public class Print_Patterns {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        System.out.println("Enter numbers of rows to print for pattern : ");
        int rows = val.nextInt();
        System.out.println("\n\nPattern 1: ");
        printLeftHalfPyramid(rows);
        System.out.println("\n\nPattern 2: ");
        printReverseLeftHalfPyramid(rows);
        System.out.println("\n\nPattern 3: ");
        printReverseRightHalfPyramid(rows);
    }

    public static void printLeftHalfPyramid(int rows) {
        System.out.println("Here is the Left half Pyramid : ");
        int rowsCount = 0;
        while (rowsCount < rows){
            int colCount = 0;
            while (colCount <= rowsCount){
                System.out.print("* ");
                colCount++;
            }
            System.out.println();
            rowsCount++;
        }
    }

    public static void printReverseLeftHalfPyramid(int rows) {
        System.out.println("Here is the Reverse Left half Pyramid : ");
        while (rows > 0){
            int colCount = 0;
            while (colCount < rows){
                System.out.print("* ");
                colCount++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void printReverseRightHalfPyramid(int maxRows){
        System.out.println("Here is the Reverse Right half Pyramid : ");
        int rows = maxRows;
        while (rows > 0){
            // this loop prints spaces
            int i = 0;
            while (i < rows - 1){
                System.out.print("  ");
                i++;
            }

            //This loop prints the stars
            int j = 0;
            while (j <= maxRows - rows){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            rows--;
        }

    }
}
