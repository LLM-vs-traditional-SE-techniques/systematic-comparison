import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest52 {

    public static boolean debug = false;

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test53");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (short) 100);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D3 = vector1D1.scalarMultiply((double) 0L);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D5 = vector1D1.scalarMultiply((double) (byte) 1);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D7 = vector1D1.scalarMultiply(0.0d);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D9 = vector1D1.scalarMultiply(0.0d);
        org.junit.Assert.assertNotNull(vector1D3);
        org.junit.Assert.assertNotNull(vector1D5);
        org.junit.Assert.assertNotNull(vector1D7);
        org.junit.Assert.assertNotNull(vector1D9);
    }
}

