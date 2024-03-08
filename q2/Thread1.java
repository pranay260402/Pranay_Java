package q2;
import java.util.*;
import java.io.*;

public class Thread1 implements Runnable {

	HashMap<Project, ArrayList<Employee>> hMap;

    public Thread1(HashMap<Project, ArrayList<Employee>> hMap) {
        this.hMap = hMap;
    }

    @Override
    public void run() {
        synchronized (this) {
            ProjectSerializer.serializeProjectDetails(hMap);
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}