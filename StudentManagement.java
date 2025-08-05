import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int Id, Marks;
    String Name;

    public Student(int Id, String Name, int Marks) {
        this.Id = Id;
        this.Name = Name;
        this.Marks = Marks;
    }

    @Override
    public String toString() {
        return "ID: " + Id + ", Name: " + Name + ", Marks: " + Marks;
    }
}

public class StudentManagement {
    static Scanner s = new Scanner(System.in);
    static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("CRUD System for managing student record");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    return; 
                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }

    // Add Student
    static void addStudent() {
        System.out.print("Enter Student Id: ");
        int id = s.nextInt();

        System.out.print("Enter Student Name: ");
        String name = s.next();

        System.out.print("Enter Student Marks: ");
        int marks = s.nextInt();

        list.add(new Student(id, name, marks));
        System.out.println("Student Added Successfully...!!");
    }

    // View Students
    static void viewStudent() {
        if (list.isEmpty()) {
            System.out.println("No Student Records Found...!!");
        } else {
            System.out.println("Student Records:");
            for (Student st : list) {
                System.out.println(st);
            }
        }
    }

    // Update Student
    static void updateStudent() {
        System.out.print("Enter Student Id To Update: ");
        int id = s.nextInt();

        boolean found = false;
        for (Student st : list) {
            if (st.Id == id) {
                System.out.print("Enter New Name: ");
                st.Name = s.next();
                System.out.print("Enter New Marks: ");
                st.Marks = s.nextInt();
                System.out.println("Student Record Updated Successfully...!!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with Id " + id + " not found.");
        }
    }

    // Delete Student
    static void deleteStudent() {
        System.out.print("Enter Student id to delete : ");
        int id = s.nextInt();
        boolean removed = list.removeIf(st -> st.Id == id);

        if (removed) {
            System.out.println("Student Deleted Successfully...!!");
        } else {
            System.out.println("Student with id " + id + " not found...");
        }
    }
}
