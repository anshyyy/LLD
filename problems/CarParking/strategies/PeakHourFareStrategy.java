package problems.CarParking.strategies;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

import problems.CarParking.models.Ticket.Ticket;

public class PeakHourFareStrategy implements FareStrategy {

    private static final LocalTime PEAK_START = LocalTime.of(8, 0);
    private static final LocalTime PEAK_END = LocalTime.of(20, 0);

    private static final BigDecimal PEAK_MULTIPLIER = new BigDecimal("1.5");

    @Override
    public BigDecimal calculateFare(Ticket ticket, BigDecimal fare) {
         BigDecimal newFare = fare;
         if(isPeakHour()){
            newFare =  newFare.multiply(PEAK_MULTIPLIER);
         }
         return newFare;
    }

    public boolean isPeakHour(){
        int currentHour = LocalDateTime.now().getHour();
        return (currentHour >= PEAK_START.getHour() && currentHour <= PEAK_END.getHour());
    }
}
