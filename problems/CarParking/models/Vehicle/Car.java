package problems.CarParking.models.Vehicle;

import problems.CarParking.enums.VehicleType;

public class Car implements Vehicle {
    String licenseNumber;
    VehicleType type;

    public Car(String licenseNumber){
        this.licenseNumber = licenseNumber;
        this.type = VehicleType.MEDIUM;
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
