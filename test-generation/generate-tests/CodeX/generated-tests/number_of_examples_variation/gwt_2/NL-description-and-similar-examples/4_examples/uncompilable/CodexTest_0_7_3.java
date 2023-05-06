import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_3 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler aUncaughtExceptionHandler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(null);
    GWT.setUncaughtExceptionHandler(aUncaughtExceptionHandler);
    assertEquals(aUncaughtExceptionHandler, GWT.getUncaughtExceptionHandler());
  }
}