import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string : ");
        String str = input.next();

        for (char ch : str.toCharArray()){           // Convert given String into array of Characters
            unique.add(ch);
        }

        System.out.printf("Your String has %d unique characters." , unique.size());
    }
}
