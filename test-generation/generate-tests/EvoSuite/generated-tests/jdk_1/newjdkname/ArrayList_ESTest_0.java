/*
 * This file was automatically generated by EvoSuite
 * Mon Aug 22 08:48:21 GMT 2022
 */

package newjdkname;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import newjdkname.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArrayList_ESTest_0 extends ArrayList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>(0);
      assertFalse(arrayList0.contains(0));
  }
}
