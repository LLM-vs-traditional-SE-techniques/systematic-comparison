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


public class CodexTest_0_4_53 { 
  @Test
  public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v1 = new AlgVector(data);
    AlgVector v2 = new AlgVector(data);
    AlgVector v3 = v1.add(v2);
    for (int i = 0; i < data.length; i++) {
      assertEquals((i+1) + ". value differs", 2*data[i], v3.getElement(i));
    }
  }
}