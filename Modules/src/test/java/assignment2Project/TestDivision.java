package assignment2Project;

/**
 * Created by aubrey on 19/03/2017.
 */
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestDivision extends TestCase{

    Division div = new Division();
    public void testDivide(){

        int myAnswer =  div.divideValues(55,10);
        Assert.assertEquals(5,myAnswer);
    }
}
