/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 12 07:34:30 GMT 2022
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import weka.core.AlgVector;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AlgVector_ESTest_5 extends AlgVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AlgVector algVector0 = new AlgVector(110);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 110);
      MockRandom mockRandom0 = new MockRandom();
      instances0.m_ClassIndex = 1620;
      Instance instance0 = algVector0.getAsInstance(instances0, mockRandom0);
      assertNotNull(instance0);
      assertEquals(110, algVector0.numElements());
      assertEquals(0.0, algVector0.norm(), 0.01);
  }
}