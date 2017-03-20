package assignment2Project;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;
/**
 * Created by aubrey on 17/03/2017.
 */
public class TruthTest extends TestCase{

    Truth  myTruth = new Truth();

    public void testName() {

        boolean age = myTruth.Myage();
        Assert.assertTrue("Is this true",age);
    }
}