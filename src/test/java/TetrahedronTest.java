import org.junit.Test;
import shapes.Tetrahedron;
import static org.junit.Assert.assertEquals;
import static common.Common.roundNumberToTwoDecimalPlaces;

public class TetrahedronTest {

    @Test
    public void testTetrahedronOfEdgeLengthOf1() {
        Tetrahedron tetrahedron = new Tetrahedron(1);
        double volume = tetrahedron.getVolume();
        double roundedVolume = roundNumberToTwoDecimalPlaces(volume);
        assertEquals(0.12, roundedVolume, 0.00001 );
    }

    @Test
    public void testTetrahedronOfEdgeLengthOf5() {
        Tetrahedron tetrahedron = new Tetrahedron(5);
        double volume = tetrahedron.getVolume();
        double roundedVolume = roundNumberToTwoDecimalPlaces(volume);
        assertEquals(14.73, roundedVolume, 0.00001 );
    }
}
