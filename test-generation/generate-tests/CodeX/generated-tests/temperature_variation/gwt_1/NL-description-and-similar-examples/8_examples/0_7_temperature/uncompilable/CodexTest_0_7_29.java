import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_29 { 
  @Test
  public void testIsClient() {
    if (GWT.isClient()) {
      // A GWT test class.
      RootPanel rootPanel = RootPanel.get();
      assertNotNull(rootPanel);
      SimplePanel testArea = new SimplePanel();
      rootPanel.add(testArea);
      testArea.getElement().setId(gwt-debug-testIsClient);
      // TODO: Test the conditions of this test case.
    }
  }
}