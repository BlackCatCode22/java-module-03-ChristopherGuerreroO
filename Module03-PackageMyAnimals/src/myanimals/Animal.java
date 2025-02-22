package myanimals;

public class Animal {
    private static int numOfAnimals = 0;

    public Animal() {
        numOfAnimals++;
        System.out.println("A new animal has been created!");
        System.out.println("Total number of animals: " + numOfAnimals);
    }

    public static int getNumOfAnimals() {
        return numOfAnimals;
    }
}
