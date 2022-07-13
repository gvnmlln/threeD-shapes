import org.junit.Test;
import shapes.Sphere;

import static common.Common.roundNumberToTwoDecimalPlaces;
import static org.junit.Assert.assertEquals;

public class SphereTest {

    @Test
    public void testGetVolumeOfSphereOfRadius1(){
        Sphere sphere = new Sphere(1);
        double volume = sphere.getVolume();
        double roundedVolume = roundNumberToTwoDecimalPlaces(volume);
        assertEquals(4.19, roundedVolume, 0.00001 );
    }

    @Test
    public void testGetVolumeOfSphereOfRadius5(){
        Sphere sphere = new Sphere(5);
        double volume = sphere.getVolume();
        double roundedVolume = roundNumberToTwoDecimalPlaces(volume);
        assertEquals(523.6, roundedVolume, 0.00001 );
    }
}
