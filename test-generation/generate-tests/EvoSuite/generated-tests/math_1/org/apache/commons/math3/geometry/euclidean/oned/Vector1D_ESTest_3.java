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
public class Vector1D_ESTest_3 extends Vector1D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ONE;
      Vector1D vector1D1 = new Vector1D(120.4, vector1D0, 120.4, vector1D0, 120.4, vector1D0, 0.0, vector1D0);
      Vector1D vector1D2 = new Vector1D(120.4, vector1D1, (-2149.9), vector1D0);
      assertEquals(1.7088781964164007E9, vector1D2.getNormSq(), 0.01);
  }
}
