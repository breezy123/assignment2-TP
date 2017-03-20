package assignment2Project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by aubrey on 17/03/2017.
 */
public class ObjectIdentityTest extends TestCase{
ObjectIdentity myObject = new ObjectIdentity();

    public void testName(){

        Assert.assertNotSame(myObject.objectA(),myObject.objectB());
    }
}