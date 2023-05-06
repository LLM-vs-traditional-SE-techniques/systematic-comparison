/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 11 13:40:28 GMT 2022
 */

package org.elasticsearch.action.index;

import org.junit.Test;
import static org.junit.Assert.*;
import org.elasticsearch.action.index.IndexRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IndexRequest_ESTest_0 extends IndexRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndexRequest indexRequest0 = new IndexRequest("WM\"GvzGn='(Czut$D", "", "ALLOW_COMMENTS");
      assertEquals("ALLOW_COMMENTS", indexRequest0.id());
      assertEquals("WM\"GvzGn='(Czut$D", indexRequest0.index());
      assertEquals((-1L), indexRequest0.getAutoGeneratedTimestamp());
      assertFalse(indexRequest0.isRetry());
      assertEquals((-3L), indexRequest0.version());
      assertEquals("", indexRequest0.type());
  }
}
