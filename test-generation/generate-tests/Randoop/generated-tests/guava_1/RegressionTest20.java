import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test21");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) 10);
        long long2 = hashCode1.padToLong();
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }
}

