package problems.CarParking.strategies;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDateTime;

import problems.CarParking.models.Ticket.Ticket;

public class RegularFareStrategy implements FareStrategy {

    @Override
    public BigDecimal calculateFare(Ticket ticket, BigDecimal fare) {
        BigDecimal parkedDuration = ticket.calculateParkingDuration();
        BigDecimal hourlyRate = FareRates.HOURLY.get(ticket.getVehicle().getSize());
        return fare.add(hourlyRate.multiply(parkedDuration));
    }
}
