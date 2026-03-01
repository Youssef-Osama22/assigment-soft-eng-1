package youssef_task;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        boolean run = true;

        while (run) {

            System.out.println("\n===== Student System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = cin.nextInt();
            cin.nextLine(); // clear buffer

            if (choice == 1) {
                Student s = new Student();

                System.out.print("Enter name: ");
                String name = cin.nextLine();

                System.out.print("Enter age: ");
                int age = cin.nextInt();

                System.out.print("Enter id: ");
                int id = cin.nextInt();

                System.out.print("Enter gpa: ");
                double gpa = cin.nextDouble();

                s.setName(name);
                s.setAge(age);
                s.setId(id);
                s.setGpa(gpa);

                students.add(s);
                System.out.println("Student added successfully!");

            }
            else if (choice == 2) {

                System.out.println("\n--- Students List ---");
                for (Student st : students) {
                    st.print_info();
                    System.out.println("--------------------");
                }

            }
            else if (choice == 3) {
                run = false;
                System.out.println("EXiting the program ");
            }
            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}