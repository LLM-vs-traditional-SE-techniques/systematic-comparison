import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_75 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector b = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector c = a.add(b);
    double[] expected = {2.0, 4.0, 6.0};
    assertArrayEquals(expected, c.getElements(), .00001);
  }
}