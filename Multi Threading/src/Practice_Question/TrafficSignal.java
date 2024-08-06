package Practice_Question;

public class TrafficSignal extends Thread{
    private final String signal;

    public TrafficSignal(String signal){
        this.signal = signal;
    }

    @Override
    public void run() {
        System.out.printf("The Signal is %s\n",signal);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
