import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_39 { 
  @Test
    public void testToShortShouldReturnMinusOneWhenTrueGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(true);
        // then
        assertEquals((short)-1, result.shortValue());
    }
}