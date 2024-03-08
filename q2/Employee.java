package q2;
import java.io.*;

public class Employee implements Serializable {

	String employeeId;
    String employeeName;
    String employeePhone;
    String employeeAddress;
    int employeeSalary;

    public Employee(String employeeId, String employeeName, String employeePhone, String employeeAddress, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeeAddress = employeeAddress;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone=" + employeePhone + ", employeeAddress=" + employeeAddress + ", employeeSalary=" + employeeSalary + "]";
    }
}