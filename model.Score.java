
package tr.kasim.obs.model;
/**
 *
 * @author selman
 */
public class Score {

    Student student;
    Lecture lecture;
    int scoreValue;
    

    public Score(Student student, Lecture lecture, int scoreValue) {
        this.student = student;
        this.lecture = lecture;
        this.scoreValue = scoreValue;
    }

   

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public void setScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public int getScoreValue() {
        return scoreValue;
    }


   

}
