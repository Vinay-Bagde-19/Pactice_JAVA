package AdvanceEnum;

public class TestingDaysEnum {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week : ");

        for (Day value : Day.values()) {
            System.out.printf("%s : %s\n",value, value.getType());
        }
    }
}
