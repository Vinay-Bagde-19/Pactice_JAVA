import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,20,30,40,50);
        //Using Collections
//        Collections.reverse(num);
//        System.out.println(num);

        // Without using collections
        System.out.println("List before reversing : " + num);
        reverse(num);
        System.out.println("List after reversing : " + num);
    }

    public static void reverse(List<Integer> list){
        for (int i = 0; i < list.size() / 2; i++) {
            ElementSwapping.swap(list , i , list.size() -1 -i);
        }
    }
}
