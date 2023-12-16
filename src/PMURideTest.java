import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PMURideTest {
    private static Student student1;
    private static Student student2;
    private static Location PMU;
    private static Location someLocation1;
    private static Location someLocation2;
    private static Car car;
    private static Driver driver;
    private static Passenger passenger;
    private static Ride ride;
    @BeforeAll
    public static void setUpAll(){
        student1 = new Student("Mohammed", "Alqadda", "202002837", "MFQ_305@hotmail.com", "+966541005774", "PMU!MFQ7");
        student2 = new Student("Ibrahim", "Aldossary", "201800259", "dossaryibrahim101@gmail.com", "+966500429898", "PMU!Ibra01");
        PMU = new Location("26.145582, 50.089928"); //pmu
        someLocation1 = new Location("26.202606, 50.205981");
        someLocation2 = new Location("26.273835, 50.194624");
        car = new Car("Silverado", "Gray", "2013",3);
        driver = new Driver(car, someLocation1, student1);
        passenger = new Passenger(someLocation2, PMU,student2);
        ride = new Ride(driver,passenger);


    }
}
