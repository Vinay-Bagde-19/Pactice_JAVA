package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Asus\\Desktop\\COURSES\\JAVA\\Pactice_JAVA\\Exception and File Handling\\" +
                "src\\FileHandling\\to-read.txt";

        try(FileReader reader = new FileReader(fileName)) {
            int charReaded = 0;
            do{
                charReaded = reader.read();
                System.out.print((char) charReaded);  // Converting the read data to character to print and to stop while loop
            }while (charReaded != -1);   // the -1 will show when there is no more data to read in file.
        }catch (IOException e){
            System.out.printf("Exception occurred: %s",e.getMessage());
        }finally {
            System.out.print("\nThe task is over.");
        }
    }
}
