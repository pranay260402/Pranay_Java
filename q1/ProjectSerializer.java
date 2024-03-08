package q1;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProjectSerializer {

	Map<Project, List<Employee>> projectMap1 = new LinkedHashMap<>();
    List<Employee> elist1 = new ArrayList<>();
    List<Employee> elist2 = new ArrayList<>();
    List<Employee> elist3 = new ArrayList<>();

    public void serializeProjectDetails(Map<Project, List<Employee>> projectMap) {
        try {
            FileOutputStream fileOut = new FileOutputStream("projectData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(projectMap);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in projectData.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void deserializeProjectDetails() {
        try {
            FileInputStream fileIn = new FileInputStream("projectData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Map<Project, List<Employee>> projectMap = (Map<Project, List<Employee>>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("DeSerialized Data : ");
            for (Map.Entry<Project, List<Employee>> entry : projectMap.entrySet()) {
                System.out.println("The Project " + entry.getKey() + " Has the following Employees");
                System.out.println("Employees .............");
                for (Employee emp : entry.getValue()) {
                    System.out.println(emp);
                }
            }
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}