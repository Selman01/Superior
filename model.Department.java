
package tr.kasim.obs.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author selman
 */
public class Department {

    String name;
    String address;

    List<Lecture> lectures = new ArrayList();
    List<Student> students = new ArrayList();

    public Department() {
    }

    
    public Department(String name, String address, List<Lecture> lectures) {
        this.name = name;
        this.address = address;
        this.lectures = lectures;
        this.students = students;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
