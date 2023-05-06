/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 12 12:07:14 GMT 2022
 */

package com.google.gwt.core.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.gwt.core.client.GWT;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GWT_ESTest_1 extends GWT_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      com.google.gwt.core.shared.GWTBridge gWTBridge0 = mock(com.google.gwt.core.shared.GWTBridge.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(gWTBridge0).isClient();
      com.google.gwt.core.shared.GWT.setBridge(gWTBridge0);
      boolean boolean0 = GWT.isClient();
      assertTrue(boolean0);
  }
}