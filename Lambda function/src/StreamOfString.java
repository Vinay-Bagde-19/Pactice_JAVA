import java.util.List;

public class StreamOfString {
    public static void main(String[] args) {
        List<String> names = List.of("Vinay","Ashhad","Kunal");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
