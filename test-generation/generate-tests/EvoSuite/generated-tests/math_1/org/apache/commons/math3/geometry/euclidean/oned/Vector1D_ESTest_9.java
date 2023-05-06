/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 12 07:20:45 GMT 2022
 */

package org.apache.commons.math3.geometry.euclidean.oned;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Vector1D_ESTest_9 extends Vector1D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector1D vector1D1 = vector1D0.POSITIVE_INFINITY.scalarMultiply((-1472.0));
      assertEquals(Double.NEGATIVE_INFINITY, vector1D1.getX(), 0.01);
  }
}
