import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_76 { 
  @Test
     public void testToShort() {
    	assertNull(underTest.toShort(null));
    	assertEquals(Short.valueOf(0), underTest.toShort(Boolean.FALSE));
    	assertEquals(Short.valueOf(1), underTest.toShort(Boolean.TRUE));
	}
}