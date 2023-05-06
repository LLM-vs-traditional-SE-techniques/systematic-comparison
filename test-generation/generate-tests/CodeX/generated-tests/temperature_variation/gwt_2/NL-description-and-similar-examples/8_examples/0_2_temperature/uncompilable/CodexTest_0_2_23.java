import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_23 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        // do nothing
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    assertEquals(handler, GWT.getUncaughtExceptionHandler());
  }
}