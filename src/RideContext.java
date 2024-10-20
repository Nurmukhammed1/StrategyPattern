public class RideContext {
    private double distance;
    private double duration;
    private boolean isPeakHour;
    private FareStrategy strategy;

    public RideContext(double distance, double duration, boolean isPeakHour) {
        this.distance = distance;
        this.duration = duration;
        this.isPeakHour = isPeakHour;
    }

    private void selectStrategy() {
        if (isPeakHour) {
            setStrategy(new Surge());
        } else if (distance < 2.0) {
            setStrategy(new Discount());
        } else {
            setStrategy(new Regular());
        }
    }

    public void setStrategy(FareStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateFare() {
        selectStrategy();
        double fare = strategy.calculateFare(distance, duration);
        return Math.max(fare, 5.0);
    }
}