package oops;

class Pen {
    String color;
    String type;

    // function/method
    public void write() {
        System.out.println("Write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int id;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.id);
    }

    // constructor
    Student() {
        System.out.println("constructor without parameters called");
    }

    Student(String name, int id) {
        System.out.println("constructor with parameters called");
        this.name = name;
        this.id = id;
    }

    Student(Student s2) {
        System.out.println("This is copy constructor !");
        this.name = s2.name;
        this.id = s2.id;
    }

    // Polymorphism
    public void PrintData(String name) {
        System.out.println("Name : " + name);
    }

    public void PrintData(int id) {
        System.out.println("Id : " + id);
    }

    public void PrintData(String name, int id) {
        System.out.println("Name : " + name + ", id : " + id);
    }
}

public class OOPS {
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.color = "Black";
        pen1.type = "Ball Pen";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Gel Pen";
        pen2.write();

        pen2.printColor();

        System.out.println("*************************\n");
        // ******* student class object *********

        // constructor without parameters called
        Student s1 = new Student();
        s1.name = "Pankaj";
        s1.id = 1;

        // constructor with parameter called
        // Student s1 =new Student("yash",14);

        Student s2 = new Student(s1);
        s2.printInfo();

        System.out.println("********** Polymorphism *********** ");
        Student s3 = new Student();
        s3.name = "Student s3";
        s3.id = 3;

        s3.PrintData(s3.name);
        s3.PrintData(s2.name);
        s3.PrintData("Virat", 18);
    }

}
