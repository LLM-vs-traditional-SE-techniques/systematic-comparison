import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test08");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean2 = objList0.contains((java.lang.Object) (-1.0d));
        boolean boolean4 = objList0.contains((java.lang.Object) 100.0d);
        boolean boolean6 = objList0.contains((java.lang.Object) 10L);
        boolean boolean8 = objList0.contains((java.lang.Object) 10.0f);
        java.util.ArrayList<java.util.Collection<java.lang.Object>> objCollectionList9 = new java.util.ArrayList<java.util.Collection<java.lang.Object>>();
        boolean boolean10 = objList0.contains((java.lang.Object) objCollectionList9);
        boolean boolean12 = objList0.contains((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }
}

