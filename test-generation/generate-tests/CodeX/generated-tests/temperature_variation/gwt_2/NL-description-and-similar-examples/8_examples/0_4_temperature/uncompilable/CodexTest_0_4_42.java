import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_42 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull(handler);
    GWT.setUncaughtExceptionHandler(null);
    assertNull(GWT.getUncaughtExceptionHandler());
    GWT.setUncaughtExceptionHandler(handler);
    assertEquals(handler, GWT.getUncaughtExceptionHandler());
  }
}