package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PracticeQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder path = new StringBuilder("C:\\Users\\Asus\\Desktop\\COURSES\\JAVA\\Pactice_JAVA\\" +
                "Exception and File Handling\\src\\FileHandling\\");

        System.out.print("Enter the file name : ");
        String fileName = input.nextLine();
        path.append(fileName);

        try(FileReader reader = new FileReader(path.toString())){
            int word = 0;

//            do{
//                word = reader.read();
//                System.out.print((char) word);
//            }while (word != -1);
            //Another way of doing this is

            while ((word = reader.read()) != -1){
                System.out.print((char) word);
            }
        }catch (FileNotFoundException e){
            System.out.printf("Caught in exception : %s not found",fileName);
        }catch (IOException e){
            System.out.printf("Caught in exception : %s",e.getMessage());
        }finally {
            System.out.print("\nTask is Over and resources are free now.");
        }
    }
}
