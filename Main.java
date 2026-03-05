import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AttendanceService service = new AttendanceService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Attendance Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View All Students");
            System.out.println("4. View Attendance for a Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Student Name: ");
                    String name = scanner.nextLine();
                    service.addStudent(new Student(id, name));
                }

                case 2 -> {
                    System.out.print("Enter Student ID to mark present: ");
                    service.markAttendance(scanner.nextInt());
                }

                case 3 -> service.viewStudents();

                case 4 -> {
                    System.out.print("Enter Student ID to view attendance: ");
                    service.viewAttendance(scanner.nextInt());
                }

                case 5 -> {
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}