/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 12 07:33:19 GMT 2022
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
import weka.core.Instances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AlgVector_ESTest_7 extends AlgVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AlgVector algVector0 = new AlgVector(doubleArray0);
      AlgVector algVector1 = algVector0.add(algVector0);
      double[] doubleArray1 = new double[4];
      algVector1.m_Elements = doubleArray1;
      // Undeclared exception!
      try { 
        algVector1.add(algVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("weka.core.AlgVector", e);
      }
  }
}