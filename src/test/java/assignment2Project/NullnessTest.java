package assignment2Project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by aubrey on 17/03/2017.
 */
public class NullnessTest extends TestCase{

    Nullness  Aph = new Nullness();


    public void testName() throws Exception {

        String Ano = Aph.Names();

        Assert.assertNull("Aphiwe",Ano);

    }
}