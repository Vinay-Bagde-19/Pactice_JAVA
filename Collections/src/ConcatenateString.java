public class ConcatenateString {
    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(concatenate("Vinay"));
        System.out.println(concatenate("Vinay","Bagde"));
    }
}
