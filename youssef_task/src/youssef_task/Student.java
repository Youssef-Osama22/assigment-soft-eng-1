package youssef_task;

 public class Student extends Person {
     private int id;
     private double gpa;

     public Student() {
     }
     public Student(int id, int gpa) {
         this.id = id;
         this.gpa = gpa;
     }


     public Student(String name, int age, int id, double gpa) {
         if(age < 0) System.out.println("Invalid age");
         if(gpa < 0 || gpa > 4) System.out.println("Invalid GPA");

         super(name, age);
         this.id = id;
         this.gpa = gpa;
     }

     public void setId(int id) {
         this.id = id;
     }

     public void setGpa(double gpa) {
         this.gpa = gpa;
     }

     public int getId() {
         return id;
     }

     public double getGpa() {
         return gpa;
     }

     @Override
     public void print_info() {
         System.out.println("-----Student------");
         super.print_info();
         System.out.println("ID ="+this.id);
         System.out.println("GPA ="+this.gpa);
         System.out.println("------------------");



     }


 }
