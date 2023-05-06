import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

    public static boolean debug = false;

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test24");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) (byte) 0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D3 = denseDoubleMatrix1D1.assign((double) 100);
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D5 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D7 = denseDoubleMatrix1D5.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D9 = denseDoubleMatrix1D5.assign((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cern.colt.matrix.DoubleMatrix1D doubleMatrix1D10 = denseDoubleMatrix1D1.assign((cern.colt.matrix.DoubleMatrix1D) denseDoubleMatrix1D5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incompatible sizes: 0 matrix and 97 matrix");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleMatrix1D3);
        org.junit.Assert.assertNotNull(doubleMatrix1D7);
        org.junit.Assert.assertNotNull(doubleMatrix1D9);
    }
}

