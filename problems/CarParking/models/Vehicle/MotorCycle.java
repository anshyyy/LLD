package problems.CarParking.models.Vehicle;


import problems.CarParking.enums.VehicleType;

public class MotorCycle implements Vehicle {
    String licenseNumber;
    VehicleType type;

    public MotorCycle(String licenseNumber){
        this.licenseNumber = licenseNumber;
        this.type = VehicleType.SMALL;
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
