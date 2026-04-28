public class Vehicle {
    // Public data member
    public boolean isEngineOn;

    // Private data members
    private String brand;
    private String model;
    private double price;
    private double mileage;

    // 1. Default Constructor
    public Vehicle() {
        this.brand = "Generic";
        this.model = "Base Model";
        this.price = 0.0;
        this.mileage = 0.0;
        this.isEngineOn = false;
    }

    // 2. Parameterized Constructor
    public Vehicle(String brand, String model, double price, double mileage) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        this.isEngineOn = false;
    }

    // 3. Copy Constructor
    public Vehicle(Vehicle otherVehicle) {
        this.brand = otherVehicle.brand;
        this.model = otherVehicle.model;
        this.price = otherVehicle.price;
        this.mileage = otherVehicle.mileage;
        this.isEngineOn = otherVehicle.isEngineOn;
    }

    // Getters and Setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getMileage() { return mileage; }
    public void setMileage(double mileage) { this.mileage = mileage; }

    // Logic Methods
    public void start() {
        isEngineOn = true;
        System.out.println(brand + " " + model + " engine started. Vroom!");
    }

    public void stop() {
        isEngineOn = false;
        System.out.println(brand + " " + model + " engine stopped.");
    }

    public void drive() {
        if (isEngineOn) {
            System.out.println("Driving the " + model + "...");
        } else {
            System.out.println("Turn the engine on first!");
        }
    }

    public void changeSpeed(int newSpeed) {
        if (isEngineOn) {
            System.out.println("Adjusting speed to " + newSpeed + " km/h.");
        }
    }

    // Calculates mileage based on distance and fuel
    public double calcMileage(double distance, double fuelUsed) {
        if (fuelUsed <= 0) return 0;
        this.mileage = distance / fuelUsed;
        return this.mileage;
    }
}