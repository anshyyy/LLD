package problems.CarParking.models.Vehicle;

import problems.CarParking.enums.VehicleType;

public class Truck  implements Vehicle {
    String licenseNumber;
    VehicleType type;

    public Truck(String licenseNumber){
        this.licenseNumber = licenseNumber;
        this.type = VehicleType.LARGE;
    }
     
    @Override
    public String getLicenceNumber(){
        return this.licenseNumber;
    }

    @Override
    public VehicleType getSize(){
        return this.type;
    }
}
