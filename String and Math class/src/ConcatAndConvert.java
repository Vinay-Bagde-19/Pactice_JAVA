import java.util.Locale;

public class ConcatAndConvert {
    public static void main(String[] args) {
        String firstName = "Vinay";
        String lastName =  "Bagde";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}
