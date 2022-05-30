package oops;

// don't have constructor
interface Animal {
    void walk();
}

class Horse implements Animal {

    @Override
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}
0
public class Interfaces {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.walk();
    }

}
