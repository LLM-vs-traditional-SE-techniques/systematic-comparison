import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_57 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler h1 = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler h2 = GWT.getUncaughtExceptionHandler();
    assertSame(h1, h2);
  }
}