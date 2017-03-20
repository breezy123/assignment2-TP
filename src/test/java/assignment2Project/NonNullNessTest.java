package assignment2Project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by aubrey on 17/03/2017.
 */
public class NonNullNessTest extends TestCase{

    NonNullNess nulls = new NonNullNess();

    public void testName() throws Exception {

        Assert.assertNotNull(nulls.numbers());

    }


}