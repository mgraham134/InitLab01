package graham.michael.InitializationLab1;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelgraham on 1/27/16.
 */
public class colorfulThingSpec {

    @Test
    public void getColorTest() {
        ColorfulThing.color = new ColorfulThing("Blue");
        assertEquals("test color ", "blue", color.getColor());
    }
}
