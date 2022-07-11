package shapes;

import static common.Common.cubeOfNumber;

public class Cube implements Shape {
    private int width;

    public Cube(int width) {
        this.width = width;
    }

    public double getVolume() {
        return cubeOfNumber(this.width);
    }
}
