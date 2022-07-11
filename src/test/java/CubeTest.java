import org.junit.Test;
import shapes.Cube;
import static org.junit.Assert.assertEquals;

public class CubeTest {

    @Test
    public void testGetVolumeOfCubeWidth1() {
        Cube cube = new Cube(1);
        assertEquals(1, cube.getVolume(), 0);
    }

    @Test
    public void testGetVolumeOfCubeWidth5() {
        Cube cube = new Cube(5);
        assertEquals(125, cube.getVolume(), 0);
    }

}
