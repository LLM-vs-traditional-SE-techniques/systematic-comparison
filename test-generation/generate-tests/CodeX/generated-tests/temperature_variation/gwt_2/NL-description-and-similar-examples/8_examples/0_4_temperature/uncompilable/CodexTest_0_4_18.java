import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_18 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertTrue(handler != null);
  }
}