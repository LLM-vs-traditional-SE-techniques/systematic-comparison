import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_1 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(null);
    try {
      GWT.setUncaughtExceptionHandler(handler);
      fail("expected NullPointerException");
    } catch (NullPointerException expected) {
    }
  }
}