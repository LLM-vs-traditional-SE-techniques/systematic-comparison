import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_9 { 
  @Test
    public void testToShort() {
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		assertEquals(1, underTest.toShort(Boolean.TRUE));
		assertEquals(0, underTest.toShort(Boolean.FALSE));
		assertEquals(1, underTest.toShort(true));
		assertEquals(0, underTest.toShort(false));
	}
}