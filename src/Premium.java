public class Premium implements FareStrategy {
    @Override
    public double calculateFare(double distance, double time) {
        return (distance * 2.0) + (time * 1.0);
    }
}
