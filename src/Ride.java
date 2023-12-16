public class Ride {
    private Driver driver;
    private Passenger passenger;
    private float distance;


    public Ride(Driver driver, Passenger passenger) {
        this.driver = driver;
        this.passenger = passenger;
        this.distance = passenger.getLocation().distanceDifference(passenger.getDestination());

    }


    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = passenger.getLocation().distanceDifference(passenger.getDestination());
    }


}
