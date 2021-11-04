public class Main extends Thread {
    public static void main(String[] args) throws InterruptedException {
        MyClock clock = new MyClock();
        clock.start();
        Thread.sleep(50000);
        clock.interrupt();
    }
}
