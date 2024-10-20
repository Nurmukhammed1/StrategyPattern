public class Regular implements FareStrategy {
    @Override
    public double calculateFare(double distance, double time) {
        return (distance * 1.5) + (time * 0.5);
    }
}
