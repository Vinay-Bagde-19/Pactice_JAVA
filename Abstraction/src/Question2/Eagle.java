package Question2;

public class Eagle extends Bird{

    public Eagle() {
        super("Eagle");
    }

    @Override
        public void fly() {
            System.out.println("Birds can fly");
        }
}
