package problems.CarParking.models.ParkingSpot;

import problems.CarParking.enums.VehicleType;
import problems.CarParking.models.Vehicle.Vehicle;

public class RegularSpot implements ParkingSpot {
    private final int spotNumber;
    private Vehicle vehicle;

    public RegularSpot(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    @Override
    public boolean isAvailable() {
        return vehicle == null;
    }

    @Override
    public void occupy(Vehicle vehicle) {
        if (!isAvailable()) {
            throw new IllegalStateException("Spot " + getSpotNumber() + " is already occupied");
        }
        if (vehicle.getSize() == VehicleType.LARGE) {
            throw new IllegalArgumentException("RegularSpot cannot fit LARGE vehicles");
        }
        this.vehicle = vehicle;
    }

    @Override
    public void vacate() {
        this.vehicle = null;
    }

    @Override
    public String getSpotNumber() {
        return "R-" + spotNumber;
    }

    @Override
    public String getSize() {
        return "REGULAR";
    }
}
