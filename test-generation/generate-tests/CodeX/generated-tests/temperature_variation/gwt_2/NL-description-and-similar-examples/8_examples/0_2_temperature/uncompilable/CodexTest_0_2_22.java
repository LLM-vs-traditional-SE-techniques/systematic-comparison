import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_22 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull(handler);
    assertTrue(handler instanceof GWT.UncaughtExceptionHandler);
  }
}