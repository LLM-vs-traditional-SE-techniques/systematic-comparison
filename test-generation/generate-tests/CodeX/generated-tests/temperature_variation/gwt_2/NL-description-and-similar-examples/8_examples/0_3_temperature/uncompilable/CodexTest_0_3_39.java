import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_39 { 
  @Test
  public void testUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException(e);
      }
    });
    try {
      throw new RuntimeException("test");
    } catch (RuntimeException e) {
      assertEquals("test", e.getCause().getMessage());
    }
  }
}