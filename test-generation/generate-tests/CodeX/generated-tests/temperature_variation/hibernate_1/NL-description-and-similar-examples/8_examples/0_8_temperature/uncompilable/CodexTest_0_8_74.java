import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_74 { 
  @Test
    public void testToShortShouldReturnOneWhenTrueGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(true);
        // then
        assertEquals(Short.valueOf((short) 1), result);
    }
    public void testToShortShouldReturnZeroWhenFalseGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(false);
        // then
        assertEquals(Short.valueOf((short) 0), result);
    }
    public void testToShortShouldReturnNullWhenNullGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(null);
        // then
        assertNull(result);
    }
*
*
*
*
* */
}