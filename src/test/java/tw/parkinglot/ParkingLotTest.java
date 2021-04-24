package tw.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotTest {

    @Test
    public void testIfParkingTheCarInTheParkingLotWithAvailableCapacity() {
        String expectedValue = "Parked";
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(1);

        parkingLot.park(car);
        String actualValue = car.getCarStatus();

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testIfUnparkingTheCarFromParkingLotThatIsAlreadyParked() {
        String expectedValue = "UnParked";
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(1);

        parkingLot.park(car);
        parkingLot.unPark(car);
        String actualValue = car.getCarStatus();

        assertEquals(expectedValue,actualValue);
    }
}
