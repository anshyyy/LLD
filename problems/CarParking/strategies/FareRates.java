package problems.CarParking.strategies;

import java.math.BigDecimal;
import java.util.Map;

import problems.CarParking.enums.VehicleType;

final class FareRates {

    static final Map<VehicleType, BigDecimal> HOURLY = Map.of(
            VehicleType.SMALL, new BigDecimal("20"),
            VehicleType.MEDIUM, new BigDecimal("40"),
            VehicleType.LARGE, new BigDecimal("60"));

    private FareRates() {
    }
}
