import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void sortInDescending(List<String> stringList){
//        Collections.sort(stringList);
//        Collections.reverse(stringList);    another way of doing this is:
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {    // but here we are only comparing the first character
                    return -1;
                }else{
                    return 1;
                }
            }
        });
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Ant", "Zebra", "Lion");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }
}
