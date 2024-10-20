public class Surge implements FareStrategy {
    @Override
    public double calculateFare(double distance, double time) {
        return (distance * 2.5) + (time * 1.5);
    }
}
