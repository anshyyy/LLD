package problems.CarParking.models.ParkingSpot;

import problems.CarParking.models.Vehicle.Vehicle;

public class OversizedSpot implements ParkingSpot {
    private final int spotNumber;
    private Vehicle vehicle;

    public OversizedSpot(int spotNumber) {
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
        this.vehicle = vehicle;
    }

    @Override
    public void vacate() {
        this.vehicle = null;
    }

    @Override
    public String getSpotNumber() {
        return "O-" + spotNumber;
    }

    @Override
    public String getSize() {
        return "OVERSIZED";
    }
}
