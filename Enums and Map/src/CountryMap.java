import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();
        country.put("India", "New Delhi");
        country.put("China", "Beijing");
        country.put("Pakistan", "Islamabad");
        country.put("SriLanka", "Columbo");
        country.put("Bangladesh", "Dhaka");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a country name to check : ");
        String capital = input.next();
        if (country.containsKey(capital)){
            System.out.println(country.get(capital));
        }else {
            System.out.println("Sorry can not find the capital.");
        }
    }
}
