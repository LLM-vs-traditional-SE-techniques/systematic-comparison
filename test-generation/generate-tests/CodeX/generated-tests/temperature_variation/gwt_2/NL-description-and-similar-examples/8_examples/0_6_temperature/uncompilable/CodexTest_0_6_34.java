import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_34 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException(e);
      }
    });
    UncaughtExceptionHandler uncaughtExceptionHandler = GWT.getUncaughtExceptionHandler();
    assertNotNull(uncaughtExceptionHandler);
    assertTrue(uncaughtExceptionHandler instanceof UncaughtExceptionHandler);
  }
}