/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 12 11:40:12 GMT 2022
 */

package com.google.common.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.hash.HashCode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HashCode_ESTest_2 extends HashCode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashCode hashCode0 = HashCode.fromLong((-44L));
      long long0 = hashCode0.padToLong();
      assertEquals((-44L), long0);
  }
}
