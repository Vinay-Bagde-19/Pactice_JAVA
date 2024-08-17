import java.util.List;

public class FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10,57,85,64,94,100);
        nums.stream()
                .filter(num -> num % 2 != 0)
                .forEach(num -> System.out.println(num));
    }
}
