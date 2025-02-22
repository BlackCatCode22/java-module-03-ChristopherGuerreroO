package myanimals;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.meow();

        Dog myDog = new Dog();
        myDog.bark();

        System.out.println("Total animals created: " + Animal.getNumOfAnimals());
    }
}
