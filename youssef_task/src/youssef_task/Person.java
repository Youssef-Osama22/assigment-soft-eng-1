package youssef_task;

public  class Person {
    protected  String name;
    protected  int age;

    public  Person() {
        this.name="none";
        this.age=0;

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
     public void print_info(){

        System.out.println("Name = "+this.name);
         System.out.println("Age ="+this.age);



     }

}
