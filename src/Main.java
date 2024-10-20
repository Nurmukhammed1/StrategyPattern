public class Main {
    public static void main(String[] args) {
        RideContext ride1 = new RideContext(10.0, 15.0, true);
        System.out.println("Surge Pricing Fare: " + ride1.calculateFare());

        RideContext ride2 = new RideContext(10.0, 15.0, false);
        System.out.println("Regular Pricing Fare: " + ride2.calculateFare());

        RideContext ride3 = new RideContext(1.5, 5.0, false);
        System.out.println("Discount Pricing Fare: " + ride3.calculateFare());
    }
}
