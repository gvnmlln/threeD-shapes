package shapes;

import static common.Common.*;

public class Sphere implements ThreeDimensionalShape {
    private int radius;

    /**
     * Creates a Sphere of the given radius
     */
    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        // Volume of a sphere: 4/3 * π * r^3 - where r is the radius
        double coefficient = (double) 4/3;
        return (coefficient * Math.PI * cubeOfNumber(this.radius));
    }
}
