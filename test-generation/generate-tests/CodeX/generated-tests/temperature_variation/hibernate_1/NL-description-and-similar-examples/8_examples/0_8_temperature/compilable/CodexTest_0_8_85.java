import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_85 { 
  @Test
    public void testToShortShouldReturnZeroWhenTrueIsGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(true);
        // then
        assertEquals(0, result.intValue());
    }
}