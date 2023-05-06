import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_33 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    final AtomicBoolean called = new AtomicBoolean(false);
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        called.set(true);
      }
    });
    try {
      throw new RuntimeException("test");
    } catch (RuntimeException e) {
      GWT.getUncaughtExceptionHandler().onUncaughtException(e);
    }
    assertTrue(called.get());
  }
}