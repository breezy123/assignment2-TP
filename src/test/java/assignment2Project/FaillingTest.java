package assignment2Project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;


/**
 * Created by aubrey on 17/03/2017.
 */
public class FaillingTest extends TestCase{

    Failling myFails = new Failling();

    public void testFailing() throws Exception {

        String answer = myFails.name();
        //here the wrong test is given which makes the test to pass else if it is the same the test will fail
        Assert.assertNotSame("Not the same",answer);

    }
}