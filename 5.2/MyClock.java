public class MyClock extends Thread{
    @Override
    public void run(){
        Thread current = Thread.currentThread();
        try {
            while (!current.isInterrupted()) {
                System.out.println("Tik");
                Thread.sleep(500);
                if (current.isInterrupted()) break;
                System.out.println("Tak");
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}