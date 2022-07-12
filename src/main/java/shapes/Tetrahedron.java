package shapes;

import static common.Common.cubeOfNumber;

public class Tetrahedron implements ThreeDimensionalShape {
    private int edgeLength;

    /**
     * Creates a Tetrahedron with edges of the given length
     */
    public Tetrahedron(int edgeLength) {
        this.edgeLength = edgeLength;
    }


    @Override
    public double getVolume() {
        // Volume of a tetrahedron: a^3/(6 * √2) - where a is the length of the edges
        double coefficient = 1/(6 * Math.sqrt(2));
        return cubeOfNumber(this.edgeLength) * coefficient;
    }
}
