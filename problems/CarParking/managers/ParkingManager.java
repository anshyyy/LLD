package problems.CarParking.managers;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import problems.CarParking.enums.VehicleType;
import problems.CarParking.models.ParkingSpot.ParkingSpot;
import problems.CarParking.models.Vehicle.Vehicle;

public class ParkingManager {
    
    public final Map<VehicleType, List<ParkingSpot>> availableSpots;
    public final Map<Vehicle,ParkingSpot> vehilceToSpotMap;
    
    ParkingManager(Map<VehicleType,List<ParkingSpot>> availableSpots){
        this.availableSpots = availableSpots;
        this.vehilceToSpotMap = new ConcurrentHashMap<>();
    }

    public ParkingSpot findSpot(Vehicle vehicle){
       VehicleType type = vehicle.getSize();

       for(VehicleType vehicleType : VehicleType.values()){
          if(vehicleType.ordinal() >= type.ordinal()){
              List<ParkingSpot> spots = availableSpots.get(type);
              for(ParkingSpot spot : spots){
                 if(spot.isAvailable()){
                    return spot;
                 }
              }
          }
       }
       return null;
    }

    

}
