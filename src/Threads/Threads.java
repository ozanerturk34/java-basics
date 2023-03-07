package Threads;

public class Threads extends Thread {
    @Override
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
