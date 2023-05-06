import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test18");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector(0);
        weka.core.Instances instances2 = null;
        java.util.Random random3 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            weka.core.Instance instance4 = algVector1.getAsInstance(instances2, random3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

