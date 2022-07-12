package shapes;

import static common.Common.cubeOfNumber;

public class Cube implements ThreeDimensionalShape {
    private int width;

    /**
     * Creates a Cube of the given width
     */
    public Cube(int width) {
        this.width = width;
    }

    public double getVolume() {
        // Volume of a cube: a^3 - where a is the width
        return cubeOfNumber(this.width);
    }
}
