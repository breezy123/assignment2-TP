package assignment2Project;

import junit.framework.TestCase;
import junit.framework.Assert;

/**
 * Created by aubrey on 17/03/2017.
 */
public class FlotingPointTest extends TestCase{

    FloatingPoint Float = new FloatingPoint();

    public void testAddFloats() throws Exception {
        float var = Float.addFloats(6.0f,7.3f);

        Assert.assertEquals(13.300000190734863,var,0.0);

    }
}