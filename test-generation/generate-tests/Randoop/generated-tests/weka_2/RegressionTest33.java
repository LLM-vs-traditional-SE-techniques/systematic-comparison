import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test34");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) 'a');
        int int2 = algVector1.numElements();
        int int3 = algVector1.numElements();
        weka.core.Instances instances4 = null;
        java.util.Random random5 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            weka.core.Instance instance6 = algVector1.getAsInstance(instances4, random5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }
}

