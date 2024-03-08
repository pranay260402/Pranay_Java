package q2;
import java.util.*;

public class Consumer implements Runnable {

	Thread1 obj1;

    public Consumer(Thread1 obj1) {
        this.obj1 = obj1;
    }

    @Override
    public void run() {
        synchronized (obj1) {
            try {
                obj1.wait();
                System.out.println("DeSerialize Called by Consumer");
                ProjectSerializer.deserializeProjectDetails();
                obj1.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}