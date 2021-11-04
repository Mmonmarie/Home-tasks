public class MyClassRunnable implements Runnable {
    private static Thread thread;
    public static void main(String[] args) {
        thread = new Thread(new MyClassRunnable());
        thread.start();
    }
    @Override
    public void run(){
        System.out.println("This is runnable thread");
    }
}
