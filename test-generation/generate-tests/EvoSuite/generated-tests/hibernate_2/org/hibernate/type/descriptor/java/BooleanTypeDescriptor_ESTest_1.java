/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 12 07:07:33 GMT 2022
 */

package org.hibernate.type.descriptor.java;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.hibernate.type.descriptor.java.BooleanTypeDescriptor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BooleanTypeDescriptor_ESTest_1 extends BooleanTypeDescriptor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanTypeDescriptor booleanTypeDescriptor0 = new BooleanTypeDescriptor();
      Boolean boolean0 = booleanTypeDescriptor0.fromString("]Ox68z");
      assertFalse(boolean0);
  }
}
