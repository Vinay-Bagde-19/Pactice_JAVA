package Intermediate_and_Terminal_Operations;

import java.util.List;
import java.util.stream.Collectors;

public class UseDistinct {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,1,3,5,6,7,8,7,9,10);
        List<Integer> distinctNum = num.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(num);
        System.out.println(distinctNum);
    }
}
