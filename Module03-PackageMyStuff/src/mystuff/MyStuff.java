package mystuff;

public class MyStuff {
    // Attributes of the iPhone
    private String modelName;
    private int storage;
    private String color;
    private boolean isOn;

    // Constructor to initialize the iPhone attributes
    public MyStuff(String modelName, int storage, String color) {
        this.modelName = modelName;
        this.storage = storage;
        this.color = color;
        this.isOn = false;  // Initially, the iPhone is turned off
    }

    // Method to turn on the iPhone
    public void turnOn() {
        isOn = true;
        System.out.println("iPhone is now on.");
    }

    // Method to turn off the iPhone
    public void turnOff() {
        isOn = false;
        System.out.println("iPhone is now off.");
    }

    // Getter methods
    public String getModelName() {
        return modelName;
    }

    public int getStorage() {
        return storage;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return isOn;
    }
}
