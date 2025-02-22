package myanimals;

public class Dog extends Animal {
    public Dog() {
        super();  // Call the Animal constructor
        System.out.println("A new dog has been created!");
    }

    public void bark() {
        System.out.println("The dog barks!");
    }
}
