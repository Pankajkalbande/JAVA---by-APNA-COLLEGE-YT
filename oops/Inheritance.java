package oops;

class Shape{
    String color;

    public void area(){
        System.out.println("Displays Area");
    }
}

class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println(l/2 * l*h);
    }
}

// multilevel tringle
class Equilateral extends Triangle{
    
}

// Hierarchical inheritance 
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        t1.color = "Red";

        t1.area(10,2);
    }
    
}
