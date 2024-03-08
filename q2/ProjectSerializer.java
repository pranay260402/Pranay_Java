package q2;
import java.util.*;
import java.io.*;

public class ProjectSerializer {

	public static void serializeProjectDetails(HashMap<Project, ArrayList<Employee>> hMap) {
        try {
            FileOutputStream fileOut = new FileOutputStream("projectData.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(hMap);
            objectOut.close();
            System.out.println("Serialized Data: " + hMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializeProjectDetails() {
        try {
            FileInputStream fileIn = new FileInputStream("projectData.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            HashMap<Project, ArrayList<Employee>> hMap = (HashMap<Project, ArrayList<Employee>>) objectIn.readObject();
            objectIn.close();
            System.out.println("DeSerialized Data: " + hMap);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}