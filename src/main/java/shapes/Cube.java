package shapes;

import static common.Common.cubeNumber;

public class Cube implements ThreeDimensionalShape {

    private final int width;

    /**
     * Creates a Cube of the given width
     * @param width the width of the cube
     */
    public Cube(int width) {
        this.width = width;
    }

    public double getVolume() {
        // Volume of a cube: a^3 - where a is the width
        return cubeNumber(this.width);
    }
}
