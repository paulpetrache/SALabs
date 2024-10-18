
// CarConfiguration.java
public class CarConfiguration {

    public static void main(String[] args) {
        // TODO: Create and configure different cars using the Builder pattern
        
        Car car1 = new Car.Builder("V8", "Automatic")
                .setInterior("Leather")
                .setColor("Black")
                .setSunroof(true)
                .setGPS(true)
                .build();

        Car car2 = new Car.Builder("V6", "Manual")
                .setColor("Red")
                .setSafetyPackage(true)
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
