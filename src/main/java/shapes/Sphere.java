package shapes;

import static common.Common.*;

public class Sphere implements ThreeDimensionalShape {

    private final int radius;

    /**
     * Creates a Sphere of the given radius
     * @param radius radius of the Sphere
     */
    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        // Volume of a sphere: 4/3 * π * r^3 - where r is the radius
        double coefficient = 4.0/3.0;
        return (coefficient * Math.PI * cubeNumber(this.radius));
    }
}
