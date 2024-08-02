import java.util.Arrays;
import java.util.List;

public class ElementSwapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(list);
        swap(list, 2, 7);  // index is given
        System.out.println("List after swapping : " + list);
    }

    public static void swap(List<Integer> list, int x,int y){
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y, swap);
    }
}
