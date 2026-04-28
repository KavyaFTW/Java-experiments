public class VehicleMain {
    public static void main(String[] args) {
        // Creating multiple objects using different constructors
        Vehicle v1 = new Vehicle(); // Default
        v1.setBrand("Tesla");
        v1.setModel("Model S");
        v1.setPrice(89990.00);
        v1.setMileage(120.5); // Efficiency rating

        Vehicle v2 = new Vehicle("Toyota", "Camry", 25000.00, 32.0); // Parameterized
        
        Vehicle v3 = new Vehicle(v2); // Copy of v2
        v3.setBrand("Lexus"); // Customizing the copy
        v3.setModel("ES");
        v3.setPrice(43000.00);

        // Creating an array of Vehicles
        Vehicle[] garage = {v1, v2, v3};

        // Demonstrating a few methods
        v1.start();
        v1.drive();
        v1.changeSpeed(100);
        v1.stop();
        System.out.println();

        // Printing in Tabular Format
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-10s %n", "Brand", "Model", "Price ($)", "Mileage");
        System.out.println("------------------------------------------------------------------");

        for (Vehicle v : garage) {
            System.out.printf("%-15s %-15s %-15.2f %-10.1f %n", 
                v.getBrand(), 
                v.getModel(), 
                v.getPrice(), 
                v.getMileage());
        }
        System.out.println("------------------------------------------------------------------");
    }
}