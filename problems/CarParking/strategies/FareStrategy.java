package problems.CarParking.strategies;

import java.math.BigDecimal;

import problems.CarParking.models.Ticket.Ticket;

public interface FareStrategy {
    BigDecimal calculateFare(Ticket ticket,BigDecimal fare);
}
