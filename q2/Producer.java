package q2;

public class Producer implements Runnable {
	Thread1 obj1;

    public Producer(Thread1 obj1) {
        this.obj1 = obj1;
    }

    @Override
    public void run() {
        synchronized (obj1) {
            System.out.println("Serialize called by Producer");
            obj1.run();
        }
    }
}