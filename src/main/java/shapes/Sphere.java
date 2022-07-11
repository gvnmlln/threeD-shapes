package shapes;

import static common.Common.*;

public class Sphere implements Shape {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        double coefficient = (double) 4/3;
        double rawVolume = (coefficient * Math.PI * cubeOfNumber(this.radius));
        return roundToTwoDecimalPlaces(rawVolume);
    }
}
