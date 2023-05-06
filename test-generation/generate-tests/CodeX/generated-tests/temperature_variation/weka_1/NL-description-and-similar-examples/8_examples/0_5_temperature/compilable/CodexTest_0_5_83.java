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


public class CodexTest_0_5_83 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(3);
    v1.setElement(0, 1);
    v1.setElement(1, 2);
    v1.setElement(2, 3);
    AlgVector v2 = new AlgVector(3);
    v2.setElement(0, 4);
    v2.setElement(1, 5);
    v2.setElement(2, 6);
    AlgVector v3 = v1.add(v2);
    assertEquals("v1 + v2", 5, v3.getElement(0), 0.0);
    assertEquals("v1 + v2", 7, v3.getElement(1), 0.0);
    assertEquals("v1 + v2", 9, v3.getElement(2), 0.0);
  }
}