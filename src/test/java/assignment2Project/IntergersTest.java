package assignment2Project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;
import junit.framework.TestCase;
/**
 * Created by aubrey on 17/03/2017.
 */
public class IntergersTest extends TestCase{

    Intergers add = new Intergers();

    public void testAdd() throws Exception {


    int var = add.addIntegers(12,16);
    //the passed values are given and bellow is the expected answer
    Assert.assertEquals(32,var);

    }





}