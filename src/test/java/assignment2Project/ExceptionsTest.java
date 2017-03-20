package assignment2Project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by aubrey on 17/03/2017.
 */
public class ExceptionsTest extends TestCase{

    Exceptions  except = new Exceptions();
    public void testName(){
    //performs the exception to check whether the passed value is 10, if it is 10 then GREEN will show else RED will show
        int answer = except.number1(10);
        Assert.assertEquals(5,answer);
    }
}