public class MyClassThread extends Thread{
    private static Thread thread;
    public static void main(String[] args) {
        thread = new Thread(new MyClassThread());
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("This is extended thread");
    }
}