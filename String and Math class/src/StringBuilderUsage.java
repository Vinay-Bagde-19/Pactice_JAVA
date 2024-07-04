public class StringBuilderUsage {
    public static void main(String[] args) {

        String[] arr = new String[]{"Hello", "my", "name", "is", "Vinay", "Bagde", "and", "Iam", "learning", "JAVA."};
        StringBuilder newStr = new StringBuilder();
        for (String str : arr){
            newStr.append(str).append(" ");
        }
        System.out.println(newStr);
    }
}
