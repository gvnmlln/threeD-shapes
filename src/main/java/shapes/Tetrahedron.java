package shapes;

import static common.Common.cubeOfNumber;
import static common.Common.roundToTwoDecimalPlaces;

public class Tetrahedron implements Shape {
    private int edgeLength;

    public Tetrahedron(int edgeLength) {
        this.edgeLength = edgeLength;
    }


    @Override
    public double getVolume() {
        double coefficient = 1/(6 * Math.sqrt(2));
        double rawVolume = cubeOfNumber(this.edgeLength) * coefficient;
        return roundToTwoDecimalPlaces(rawVolume);
    }
}
