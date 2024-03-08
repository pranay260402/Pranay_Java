package q1;

import java.io.*;

public class Project implements Serializable {
	String projectCode;
    String projectName;
    int projectStrength;

    public Project(String projectCode, String projectName, int projectStrength) {
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.projectStrength = projectStrength;
    }

    @Override
    public String toString() {
        return "Project [projectCode=" + projectCode + ", projectName=" + projectName + ", projectStrength=" + projectStrength + "]";
    }
}