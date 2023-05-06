import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_9 { 
  @Test
  public void testShortToBoolean() {
			assertNull(getBooleanConverter().toBoolean(null));
			assertTrue(getBooleanConverter().toBoolean(Short.valueOf(1)).booleanValue());
			assertFalse(getBooleanConverter().toBoolean(Short.valueOf(0)).booleanValue());
}