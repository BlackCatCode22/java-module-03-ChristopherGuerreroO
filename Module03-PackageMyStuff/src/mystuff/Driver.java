package mystuff;

public class Driver {
    public static void main(String[] args) {
        // Creating an iPhone object
        MyStuff myiPhone = new MyStuff("iPhone 13", 256, "Midnight");

        // Using methods
        System.out.println("Model: " + myiPhone.getModelName());
        System.out.println("Storage: " + myiPhone.getStorage() + "GB");
        System.out.println("Color: " + myiPhone.getColor());

        // Turning on the iPhone
        myiPhone.turnOn();

        // Checking the status
        if (myiPhone.isOn()) {
            System.out.println("Your iPhone is ready to use.");
        }

        // Turning off the iPhone
        myiPhone.turnOff();
    }
}
