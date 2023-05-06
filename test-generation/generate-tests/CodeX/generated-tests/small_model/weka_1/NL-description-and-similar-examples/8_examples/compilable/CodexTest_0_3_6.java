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


public class CodexTest_0_3_6 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] {1.0, 2.0, 3.0});
    AlgVector b = new AlgVector(new double[] {2.0, 3.0, 4.0});
    AlgVector c = a.add(b);
    assertEquals(3.0, c.getElement(0), 0.0);
    assertEquals(5.0, c.getElement(1), 0.0);
    assertEquals(7.0, c.getElement(2), 0.0);
  }
}