package shapes;

import static common.Common.cubeNumber;

public class Tetrahedron implements ThreeDimensionalShape {

    private final int edgeLength;

    /**
     * Creates a Tetrahedron with edges of the given length
     * @param edgeLength length of the Tetrahedron's edges
     */
    public Tetrahedron(int edgeLength) {
        this.edgeLength = edgeLength;
    }


    @Override
    public double getVolume() {
        // Volume of a tetrahedron: a^3/(6 * √2) - where a is the length of the edges
        double coefficient = 1/(6 * Math.sqrt(2));
        return cubeNumber(this.edgeLength) * coefficient;
    }
}
