import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest5 {

    public static boolean debug = false;

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test06");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D3 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D5 = denseDoubleMatrix1D3.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D6 = denseDoubleMatrix1D1.assign(doubleMatrix1D5);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D8 = denseDoubleMatrix1D1.assign((double) (byte) 10);
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D10 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D12 = denseDoubleMatrix1D10.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D13 = denseDoubleMatrix1D1.assign(doubleMatrix1D12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseDoubleMatrix1D3 and doubleMatrix1D13", denseDoubleMatrix1D3.equals(doubleMatrix1D13) ? denseDoubleMatrix1D3.hashCode() == doubleMatrix1D13.hashCode() : true);
    }
}

