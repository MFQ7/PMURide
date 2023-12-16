public class Car {
    private String model;
    private String year;
    private String color;
    private int capacity;

    public Car(String model, String color, String year, int capacity) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
/////////////////////
public class Driver {
  public class Driver extends Student{
    Car car;
    Location location;

    public Driver(String fName, String lName, String id, String email, String phoneNum, String password, Car car, Location location) {
        super(fName, lName, id, email, phoneNum, password);
        this.car = car;
        this.location = location;
    }

    public Driver(Car car, Location location) {
        this.car = car;
        this.location = location;
    }
    public Driver(Car car, Location location, Student student) {
        super(student.getFirstName(), student.getLastName(), student.getId(), student.getEmail(),student.getPhoneNum(), student.getPassword());
        this.car = car;
        this.location = location;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
}
