import java.util.List;

public class FilterString {
    public static void main(String[] args) {
        List<String> strs = List.of("Vinay Bagde","and python","together","but not","Learning",
                "is a Studying java", "from Youtube form KG Coding Channel");
        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("",(a, b) -> a + " " + b);
        System.out.println(result);
    }
}
