import org.junit.Test;
import shapes.Tetrahedron;
import static org.junit.Assert.assertEquals;

public class TetrahedronTest {

    @Test
    public void testTetrahedronOfEdgeLengthOf1() {
        Tetrahedron tetrahedron = new Tetrahedron(1);
        assertEquals(0.12, tetrahedron.getVolume(), 0);
    }

    @Test
    public void testTetrahedronOfEdgeLengthOf5() {
        Tetrahedron tetrahedron = new Tetrahedron(5);
        assertEquals(14.73, tetrahedron.getVolume(), 0);
    }
}
