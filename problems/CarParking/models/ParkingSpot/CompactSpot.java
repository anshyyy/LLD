package problems.CarParking.models.ParkingSpot;

import problems.CarParking.enums.VehicleType;
import problems.CarParking.models.Vehicle.Vehicle;

public class CompactSpot implements ParkingSpot {
    private final int spotNumber;
    private Vehicle vehicle;

    public CompactSpot(int spotNumber) {
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
        if (vehicle.getSize() != VehicleType.SMALL) {
            throw new IllegalArgumentException("CompactSpot only fits SMALL vehicles");
        }
        this.vehicle = vehicle;
    }

    @Override
    public void vacate() {
        this.vehicle = null;
    }

    @Override
    public String getSpotNumber() {
        return "C-" + spotNumber;
    }

    @Override
    public String getSize() {
        return "COMPACT";
    }
}
