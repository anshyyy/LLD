package problems.CarParking.strategies;

import java.math.BigDecimal;
import java.util.List;

import problems.CarParking.models.Ticket.Ticket;

public class FareCalculator {

    private List<FareStrategy> strategies;

    public FareCalculator(List<FareStrategy> strategy) {
        this.strategies = strategy;
    }

    public BigDecimal calculateFare(Ticket ticket) {
        BigDecimal fare = BigDecimal.ZERO;

        for(FareStrategy strategy : strategies){
             fare = strategy.calculateFare(ticket, fare);
        }
        return fare;
    }
}
