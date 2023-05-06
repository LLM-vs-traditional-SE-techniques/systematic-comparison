import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_6 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler exceptionHandler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {}
    };
    Thread.setDefaultUncaughtExceptionHandler(exceptionHandler);
    assertEquals(exceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
  }
}