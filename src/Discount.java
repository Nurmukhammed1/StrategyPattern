public class Discount implements FareStrategy {
    @Override
    public double calculateFare(double distance, double time) {
        double regularFare = (distance * 1.5) + (time * 0.5);
        return regularFare * 0.9;
    }
}
