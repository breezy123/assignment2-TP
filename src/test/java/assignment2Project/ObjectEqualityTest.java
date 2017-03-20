package assignment2Project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by aubrey on 17/03/2017.
 */
public class ObjectEqualityTest extends TestCase{

    private ObjectEquality Aph = new ObjectEquality();


    public void testObjects(){
        String var = Aph.name1();
        String hisName = Aph.name2();

        Assert.assertEquals(var,hisName);

    }


}