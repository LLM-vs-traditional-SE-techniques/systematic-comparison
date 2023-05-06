import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest15 {

    public static boolean debug = false;

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest15.test16");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D3 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D5 = denseDoubleMatrix1D3.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D6 = denseDoubleMatrix1D1.assign(doubleMatrix1D5);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D8 = denseDoubleMatrix1D1.assign((double) (byte) 10);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D10 = denseDoubleMatrix1D1.assign((double) (byte) 100);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D12 = denseDoubleMatrix1D1.assign((double) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseDoubleMatrix1D3 and doubleMatrix1D12", denseDoubleMatrix1D3.equals(doubleMatrix1D12) ? denseDoubleMatrix1D3.hashCode() == doubleMatrix1D12.hashCode() : true);
    }
}

