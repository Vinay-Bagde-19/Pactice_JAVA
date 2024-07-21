package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriting {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Asus\\Desktop\\COURSES\\JAVA\\Pactice_JAVA\\Exception and File Handling\\src\\" +
                "FileHandling\\java-course.txt";
        boolean succes = false;
        
        try(FileWriter writer = new FileWriter(fileName)){  // This is try with resource syntax , in this we do not need
            // to close the resource it is taken care by JVM. we should use this when we are dealing with resources
            writer.write("This is write function to write in the file , in File Handling .");
            writer.flush(); // this line will suggest the JVM to write in the file and tell that our writing is over.
            succes = true;
        }catch (IOException e){
            System.out.printf("The exception is %s",e.getMessage());
        }finally {
            if (succes) {
                System.out.println("Succesfully Written in File.");
            }
        }
    }
}
