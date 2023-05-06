import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest55 {

    public static boolean debug = false;

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test56");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix2D doubleMatrix2D4 = denseDoubleMatrix1D1.like2D(100, 1);
        cern.colt.matrix.DoubleMatrix2D doubleMatrix2D7 = denseDoubleMatrix1D1.like2D((int) (short) 0, (int) (short) 100);
        cern.colt.matrix.DoubleMatrix2D doubleMatrix2D10 = denseDoubleMatrix1D1.like2D(100, (int) ' ');
        org.junit.Assert.assertNotNull(doubleMatrix2D4);
        org.junit.Assert.assertNotNull(doubleMatrix2D7);
        org.junit.Assert.assertNotNull(doubleMatrix2D10);
    }
}

