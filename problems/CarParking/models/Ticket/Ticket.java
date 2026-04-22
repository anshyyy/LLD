package problems.CarParking.models.Ticket;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDateTime;

import problems.CarParking.models.ParkingSpot.ParkingSpot;
import problems.CarParking.models.Vehicle.Vehicle;

public class Ticket {
    private String ticketId;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(String ticketId, ParkingSpot spot, Vehicle vehicle) {
        this.ticketId = ticketId;
        this.parkingSpot = spot;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
    }

    public void setExitTime() {
        this.exitTime = LocalDateTime.now();
    }

    public String getTicketId() {
        return ticketId;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public BigDecimal calculateParkingDuration() {
        Duration d = Duration.between(entryTime, exitTime == null ? LocalDateTime.now() : exitTime);
        return BigDecimal.valueOf(d.toMinutes());
    }

}
