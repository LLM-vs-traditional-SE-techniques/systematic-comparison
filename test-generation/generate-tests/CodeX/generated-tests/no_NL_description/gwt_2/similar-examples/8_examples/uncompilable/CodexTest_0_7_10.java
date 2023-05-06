import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_10 { 
  @Test
  public void testUncaughtExceptionHandler() {
    Thread.UncaughtExceptionHandler handler =
        new Thread.UncaughtExceptionHandler() {
          @Override public void uncaughtException(Thread t, Throwable e) {
          }
        };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    assertSame(handler, Thread.getUncaughtExceptionHandler());
  }
}