import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public String getLetterGrade() {
        if (grade >= 90) return "A";
        else if (grade >= 80) return "B";
        else if (grade >= 70) return "C";
        else if (grade >= 60) return "D";
        else return "F";
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
        System.out.println("Letter: " + getLetterGrade());
        System.out.println("---------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            input.nextLine();
            System.out.println("Student " + (i + 1));
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("ID: ");
            int id = input.nextInt();
            System.out.print("Grade: ");
            double grade = input.nextDouble();

            students[i] = new Student(name, id, grade);
        }

        int choice;

        do {
            System.out.println("\n1- Show All Students");
            System.out.println("2- Show Average Grade");
            System.out.println("3- Search by ID");
            System.out.println("4- Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();

            if (choice == 1) {
                for (Student s : students)
                    s.displayInfo();
            }

            else if (choice == 2) {
                double sum = 0;
                for (Student s : students)
                    sum += s.getGrade();
                System.out.println("Average = " + (sum / n));
            }

            else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int searchId = input.nextInt();
                boolean found = false;

                for (Student s : students) {
                    if (s.getId() == searchId) {
                        s.displayInfo();
                        found = true;
                        break;
                    }
                }

                if (!found)
                    System.out.println("Student not found.");
            }

        } while (choice != 4);

        input.close();
    }
}