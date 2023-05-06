import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_16 { 
  @Test
  public void testFromString_false() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("false");
		// then
		assertFalse(result);
	}
  public void testFromString_true() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("true");
		// then
		assertTrue(result);
	}
}