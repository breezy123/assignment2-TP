package assignment2Project;

/**
 * Created by aubrey on 19/03/2017.
 */
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestAddition extends TestCase{

    Addition myAdd = new Addition();

    public void testAdd(){
        int myValue = myAdd.AddValues(12,10,19);
        Assert.assertEquals(32,myValue);
    }
}
