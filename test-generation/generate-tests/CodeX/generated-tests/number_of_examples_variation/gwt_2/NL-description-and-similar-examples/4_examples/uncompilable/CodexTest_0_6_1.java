import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_1 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull(handler);
  }
```
}