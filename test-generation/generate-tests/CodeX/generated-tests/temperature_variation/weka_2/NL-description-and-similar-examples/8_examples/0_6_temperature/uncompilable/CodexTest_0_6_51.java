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


public class CodexTest_0_6_51 { 
  @Test
  /**
   * Tests the copy method.
   */
  public void testCopy() {
    AlgVector v1 = new AlgVector(5);
    v1.setElement(0, 1.0);
    v1.setElement(1, 2.0);
    v1.setElement(2, 3.0);
    v1.setElement(3, 4.0);
    v1.setElement(4, 5.0);
    AlgVector v2 = (AlgVector) v1.copy();
    assertEquals("Copy constructor failed", v1, v2);
  }
}