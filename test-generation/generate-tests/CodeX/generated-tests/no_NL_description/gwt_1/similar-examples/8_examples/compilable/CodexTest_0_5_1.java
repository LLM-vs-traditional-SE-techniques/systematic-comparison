import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_1 { 
  @Test
    public void testIsClient() {
        assertTrue(GWT.isClient());
        assertFalse(GWT.isScript());
        assertFalse(GWT.isProdMode());
    }
}