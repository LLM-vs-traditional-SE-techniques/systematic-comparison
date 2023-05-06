import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_8 { 
  @Test
  public void testFromStringShouldReturnTrueWhenYStringGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("Y");
		// then
		assertTrue(result);
	}
Input: public Boolean fromString(String string) {
		return Boolean.valueOf( string );
	}
Output: public void testFromStringShouldReturnFalseWhenFStringGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("F");
		// then
		assertFalse(result);
	}
}