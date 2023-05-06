import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test39");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (short) 100);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D3 = vector1D1.scalarMultiply((double) 0L);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D5 = vector1D1.scalarMultiply((double) (byte) 1);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D7 = vector1D1.scalarMultiply((double) (byte) 100);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D9 = vector1D7.scalarMultiply(0.0d);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D11 = vector1D9.scalarMultiply((double) (byte) 0);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D13 = vector1D9.scalarMultiply((double) 10L);
        double double14 = vector1D13.getX();
        org.junit.Assert.assertNotNull(vector1D3);
        org.junit.Assert.assertNotNull(vector1D5);
        org.junit.Assert.assertNotNull(vector1D7);
        org.junit.Assert.assertNotNull(vector1D9);
        org.junit.Assert.assertNotNull(vector1D11);
        org.junit.Assert.assertNotNull(vector1D13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }
}

