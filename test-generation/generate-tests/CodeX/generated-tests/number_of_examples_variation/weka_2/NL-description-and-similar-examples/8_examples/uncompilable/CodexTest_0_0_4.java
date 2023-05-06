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


public class CodexTest_0_0_4 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances insts = new Instances(new Instance(numAtts), numInstances);
    insts.setClassIndex(numAtts - 1);
    insts.setRelationName("Test");
    for (int i = 0; i < numInstances; i++) {
      insts.add(new Instance(numAtts));
    }
    double[] values = new double[numAtts];
    for (int i = 0; i < numAtts; i++) {
      values[i] = i;
    }
    AlgVector vec = new AlgVector(values);
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
      for (int i = 0; i < numAtts; i++) {
	assertEquals("Values differ", values[i], inst.value(i));
      }
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}