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


public class CodexTest_0_7_23 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(0);
    AlgVector v2 = new AlgVector(0);
    AlgVector v3 = v1.add(v2);
    assertTrue(v3.equals(v1));
  }
}