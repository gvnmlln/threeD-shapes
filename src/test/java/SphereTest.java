import org.junit.Test;
import shapes.Sphere;
import static org.junit.Assert.assertEquals;

public class SphereTest {

    @Test
    public void testGetVolumeOfSphereOfRadius1(){
        Sphere sphere = new Sphere(1);
        assertEquals(4.19, (double)sphere.getVolume(), 0);
    }

    @Test
    public void testGetVolumeOfSphereOfRadius5(){
        Sphere sphere = new Sphere(5);
        assertEquals(523.6, (double) sphere.getVolume(), 0);
    }
}
