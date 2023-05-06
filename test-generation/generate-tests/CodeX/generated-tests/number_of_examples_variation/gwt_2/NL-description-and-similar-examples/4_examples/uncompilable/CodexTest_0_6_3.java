import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_3 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull(handler);
    final Throwable expected = new Throwable();
    try {
      handler.onUncaughtException(expected);
      fail("expected onUncaughtException() to throw");
    } catch (Throwable actual) {
      assertSame(expected, actual);
    }
  }
}