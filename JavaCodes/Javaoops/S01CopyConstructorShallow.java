class Address {
    private String city;
    private String state;

    // Constructor
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Getters and Setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", state=" + state + "]";
    }
}

class Person {
    private String name;
    private Address address;

    // Constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = address; // Shallow copy of Address
    }

    // Shallow Copy Constructor for Person
    public Person(Person other) {
        this.name = other.name;
        this.address = other.address; // Shallow copy of Address
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }
}

public class S01CopyConstructorShallow {
    public static void main(String[] args) {
        Address address1 = new Address("New York", "NY");
        Person person1 = new Person("John Doe", address1);

        // Creating a shallow copy of person1
        Person person2 = new Person(person1);

        // Modifying the address of person2
        person2.getAddress().setCity("Los Angeles");

        // Displaying both persons
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
    }
}
