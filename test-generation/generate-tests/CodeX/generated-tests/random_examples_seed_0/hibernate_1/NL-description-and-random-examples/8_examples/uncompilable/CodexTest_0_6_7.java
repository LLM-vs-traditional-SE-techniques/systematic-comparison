import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_7 { 
  @Test
        public void testBooleanToShort() {
		Boolean b = false;
		Short s = (short) 0;
		assertEquals(s, toShort(b));
	}
}