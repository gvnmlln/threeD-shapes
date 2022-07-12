package common;

import shapes.ThreeDimensionalShape;

import java.math.BigDecimal;

public class Common {
    /**
     * Accepts a double value and rounds it to two decimal places
     * @param value
     * @return value rounded to two decimal places
     */
    public static double roundDoubleToTwoDecimalPlaces(double value) {
        BigDecimal rounded = BigDecimal.valueOf(value);
        rounded = rounded.setScale(2, BigDecimal.ROUND_HALF_UP);
        return rounded.doubleValue();
    }

    /**
     * Cubes a given numeric value
     * @param value
     * @return the cube of the value
     */
    public static double cubeOfNumber(double value) {
        return value*value*value;
    }
}
