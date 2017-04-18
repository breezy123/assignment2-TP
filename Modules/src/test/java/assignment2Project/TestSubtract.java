package assignment2Project;

/**
 * Created by aubrey on 19/03/2017.
 */

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestSubtract extends TestCase{

    Subtract sub = new Subtract();

    public void testSubtract(){
        float myFloat = sub.subtractValues(40,32);
        Assert.assertEquals(8.0,myFloat);
    }
}
