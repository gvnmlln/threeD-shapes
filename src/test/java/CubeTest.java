import org.junit.Test;
import shapes.Cube;

import static common.Common.roundNumberToTwoDecimalPlaces;
import static org.junit.Assert.assertEquals;

public class CubeTest {

    @Test
    public void testGetVolumeOfCubeWidth1() {
        Cube cube = new Cube(1);
        double volume = cube.getVolume();
        double roundedVolume = roundNumberToTwoDecimalPlaces(volume);
        assertEquals(1, roundedVolume, 0.00001 );
    }

    @Test
    public void testGetVolumeOfCubeWidth5() {
        Cube cube = new Cube(5);
        double volume = cube.getVolume();
        double roundedVolume = roundNumberToTwoDecimalPlaces(volume);
        assertEquals(125, roundedVolume, 0.00001 );
    }

}
