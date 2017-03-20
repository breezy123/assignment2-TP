package assignment2Project;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by aubrey on 17/03/2017.
 */
public class FalseTest extends TestCase{

    False fls = new False();

    public void testName() throws Exception {

        boolean variant = fls.Surname();
        //false value has to be passed in order to make this test pass if it is true it will then fail
        Assert.assertFalse("Is this false",variant);

    }
}