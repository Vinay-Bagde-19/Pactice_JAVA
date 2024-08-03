public class TestingDaysEnum {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week : ");
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);

        // Or we can print it as :
        System.out.println("\nPrinting all days using foreach by first making its array using Day.values()");
        for (Day value : Day.values()) {
            System.out.println(value);
        }
    }
}
