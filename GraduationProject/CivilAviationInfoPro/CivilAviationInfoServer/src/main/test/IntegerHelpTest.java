import cauc.kyu.civilaviationinfoserver.utils.IntegerHelp;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 2016/5/9.
 */
public class IntegerHelpTest {
    @Test
    public void testIsInteger() {
        String s = "0.3";
        Assert.assertEquals(false,IntegerHelp.isInteger(s));

        String s1 = "ss";
        Assert.assertEquals(false,IntegerHelp.isInteger(s1));

        String s2 = "10";
        Assert.assertEquals(true,IntegerHelp.isInteger(s2));
    }


    @Test
    public void testIsPositiveInteger() {
        String s = "0.3";
        Assert.assertEquals(false,IntegerHelp.isPositiveInteger(s));

        String s1 = "ss";
        Assert.assertEquals(false,IntegerHelp.isPositiveInteger(s1));

        String s2 = "10";
        Assert.assertEquals(true,IntegerHelp.isPositiveInteger(s2));

        String s3 = "0";
        Assert.assertEquals(false,IntegerHelp.isPositiveInteger(s3));

        String s4 = "-4";
        Assert.assertEquals(false,IntegerHelp.isPositiveInteger(s4));
    }

    @Test
    public void testIsNon_PositiveInteger() {
        String s = "0.3";
        Assert.assertEquals(false,IntegerHelp.isNon_negativeInteger(s));

        String s1 = "ss";
        Assert.assertEquals(false,IntegerHelp.isNon_negativeInteger(s1));

        String s2 = "10";
        Assert.assertEquals(true,IntegerHelp.isNon_negativeInteger(s2));

        String s3 = "0";
        Assert.assertEquals(true,IntegerHelp.isNon_negativeInteger(s3));

        String s4 = "-4";
        Assert.assertEquals(false,IntegerHelp.isNon_negativeInteger(s4));
    }
}
