package T1;

import java.util.ArrayList;

/**
 * @ClassName:Course
 * @Auther: Lyh
 * @Date: 2022/10/16 14:28
 * @Version: v1.0
 */
public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public ArrayList<String> getStudents() {
        return students;
    }

    public void addStudents(String student){
        students.add(student);
        numberOfStudents++;
    }
    public void dropStudent(String student){
        students.remove(student);
        numberOfStudents--;
    }
    public String getCourseName() {
        return courseName;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }
}
