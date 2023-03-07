package Threads;

public class RunnableClass implements Runnable {
    public void run() {
        for(int i = 0; i < 8; i++){
            System.out.println("run");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
