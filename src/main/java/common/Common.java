package common;

import java.math.BigDecimal;

public class Common {
    public static double roundToTwoDecimalPlaces(double value) {
        BigDecimal rounded = BigDecimal.valueOf(value);
        rounded = rounded.setScale(2, BigDecimal.ROUND_HALF_UP);
        return rounded.doubleValue();
    }

    public static double cubeOfNumber(double value) {
        return value*value*value;
    }
}
