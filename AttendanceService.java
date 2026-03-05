import java.util.ArrayList;
import java.util.List;

public class AttendanceService {

    private List<Student> students = new ArrayList<>();

    
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    public void markAttendance(int studentId) {
        for (Student s : students) {
            if (s.getId() == studentId) {
                s.markPresent();
                System.out.println(s.getName() + " marked present.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public void viewAttendance(int studentId) {
        for (Student s : students) {
            if (s.getId() == studentId) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}