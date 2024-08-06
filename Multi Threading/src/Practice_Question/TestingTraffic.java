package Practice_Question;

public class TestingTraffic {
    public static void main(String[] args) throws InterruptedException{
        TrafficSignal t1 = new TrafficSignal("RED");
        TrafficSignal t2 = new TrafficSignal("YELLOW");
        TrafficSignal t3 = new TrafficSignal("GREEN");

        //Red
        t1.start();
        t1.join();

        //Yellow
        t2.start();
        t2.join();

        //Green
        t3.start();
        t3.join();
    }
}
