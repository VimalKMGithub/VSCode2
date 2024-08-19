class Parent {
    private int a;

    // Constructor of Parent class
    public Parent(int a) {
        this.a = a;
        System.out.println("Parent constructor called, a = " + a);
    }
}

class Child extends Parent {
    private int b;

    // Constructor of Child class
    public Child(int a, int b) {
        super(a); // Calls the Parent class constructor
        this.b = b;
        System.out.println("Child constructor called, b = " + b);
    }
}

public class S04ParentConstructorCalling {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
    }
}
