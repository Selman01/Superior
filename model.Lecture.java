
package tr.kasim.obs.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author selman
 */
public class Lecture {

    String name;
    String code;

    Department department;
    
    List<Score> scores = new ArrayList();

    public Lecture() {
    }

    public Lecture(String name, String code, Department department, List<Score> scores) {
        this.name = name;
        this.code = code;
        this.department = department;
        this.scores = scores;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
