package assignment2Project;

/**
 * Created by aubrey on 19/03/2017.
 */
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestMultiply extends TestCase{
    Multiply multi = new Multiply();

    public void testMultiply(){
        float floatVal = multi.multiplyValues(7,1);
        Assert.assertEquals(7.0,floatVal);
    }
}
