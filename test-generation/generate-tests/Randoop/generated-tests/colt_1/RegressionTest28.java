import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test29");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D3 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D5 = denseDoubleMatrix1D3.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D6 = denseDoubleMatrix1D1.assign(doubleMatrix1D5);
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D8 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) (byte) 10);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D10 = denseDoubleMatrix1D8.assign((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            cern.colt.matrix.DoubleMatrix1D doubleMatrix1D11 = denseDoubleMatrix1D1.assign((cern.colt.matrix.DoubleMatrix1D) denseDoubleMatrix1D8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incompatible sizes: 97 matrix and 10 matrix");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleMatrix1D5);
        org.junit.Assert.assertNotNull(doubleMatrix1D6);
        org.junit.Assert.assertNotNull(doubleMatrix1D10);
    }
}

