class Example {
    private int x;
    private int y;
    private int z;

    // No-argument constructor
    public Example() {
        this(0, 0); // Calls the constructor with two arguments
        System.out.println("No-argument constructor called");
    }

    // Constructor with two arguments
    public Example(int x, int y) {
        this(x, y, 0); // Calls the constructor with three arguments
        System.out.println("Two-argument constructor called");
    }

    // Constructor with three arguments
    public Example(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Three-argument constructor called");
    }

    @Override
    public String toString() {
        return "Example [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}

public class S03ConstructorChaining {
    public static void main(String[] args) {
        Example example1 = new Example(); // Calls the no-argument constructor
        Example example2 = new Example(5, 10); // Calls the two-argument constructor
        Example example3 = new Example(1, 2, 3); // Calls the three-argument constructor

        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
    }
}
