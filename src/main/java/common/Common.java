package common;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Common {

    /**
     * Rounds a number to two decimal places
     * @param number number to be rounded
     * @return rounded number
     */
    public static double roundNumberToTwoDecimalPlaces(double number) {
        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Cubes a number
     * @param number number to be cubed
     * @return the cubed number
     */
    public static double cubeNumber(double number) {
        return number*number*number;
    }
}
