package myanimals;

public class Cat extends Animal {
    public Cat() {
        super();  // Call the Animal constructor
        System.out.println("A new cat has been created!");
    }

    public void meow() {
        System.out.println("The cat meows!");
    }
}
