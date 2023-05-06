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


public class CodexTest_0_4_64 { 
  @Test
  public void testAdd() {
    double[] data1 = {1.0, 2.0, 3.0};
    double[] data2 = {3.0, 2.0, 1.0};
    double[] data3 = {4.0, 4.0, 4.0};
    AlgVector v1 = new AlgVector(data1);
    AlgVector v2 = new AlgVector(data2);
    AlgVector v3 = new AlgVector(data3);
    v1.add(v2);
    assertEquals("Adding vectors failed", v3, v1);
  }
}