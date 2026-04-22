package problems.CarParking.models.ParkingSpot;

import problems.CarParking.models.Vehicle.Vehicle;

public interface ParkingSpot {
    public boolean isAvailable();
    public void occupy(Vehicle vehilce);
    public void vacate();
    public String getSpotNumber();
    public String getSize();
}
