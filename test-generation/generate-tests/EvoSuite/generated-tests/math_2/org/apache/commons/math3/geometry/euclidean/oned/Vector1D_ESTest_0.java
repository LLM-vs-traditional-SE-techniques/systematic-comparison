/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 12 07:21:57 GMT 2022
 */

package org.apache.commons.math3.geometry.euclidean.oned;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Vector1D_ESTest_0 extends Vector1D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector1D vector1D1 = new Vector1D(2660.35821267, vector1D0, 2660.35821267, vector1D0, 2660.35821267, vector1D0, 2660.35821267, vector1D0);
      double double0 = Vector1D.distanceSq(vector1D1, vector1D1);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, vector1D1.getX(), 0.01);
  }
}
