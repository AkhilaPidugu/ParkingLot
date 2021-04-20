package tw.parkinglot;

import java.util.ArrayList;

public class ParkingLot {

    int parkingLotCapacity;

    private  ArrayList<Car> carList=new ArrayList<Car>();

    public ParkingLot(int capacity) {
      this.parkingLotCapacity = capacity;
    }

    public void park(Car car) {
        if(parkingLotCapacity>=1) {
            carList.add(car);
            car.setCarStatus("Parked");
            parkingLotCapacity-=1;
        }
    }
}
