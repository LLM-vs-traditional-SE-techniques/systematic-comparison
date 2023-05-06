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


public class CodexTest_0_6_71 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(2);
    AlgVector v2 = new AlgVector(2);
    v1.setElement(0, 1.);
    v1.setElement(1, 2.);
    v2.setElement(0, 3.);
    v2.setElement(1, 4.);
    AlgVector v3 = v1.add(v2);
    assertEquals(v3.getElement(0), 4., 0.01);
    assertEquals(v3.getElement(1), 6., 0.01);
  }
}