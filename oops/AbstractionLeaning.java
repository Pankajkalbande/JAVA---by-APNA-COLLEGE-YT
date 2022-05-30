package oops;
//  show important information to user
// abstraction is imaginary thing like animal , it is like concept

abstract class Animal {
    abstract void walk() ;
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walk on 2 legs");
    }
}

public class AbstractionLeaning {
    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.walk();
    }

}
