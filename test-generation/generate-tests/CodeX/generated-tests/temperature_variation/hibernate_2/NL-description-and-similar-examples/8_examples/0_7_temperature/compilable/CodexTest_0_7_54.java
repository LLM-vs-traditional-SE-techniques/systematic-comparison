import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_54 { 
  @Test
  public void testFromStringShouldReturnNullWhenNullStringGiven() {
            // given
            BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
            // when
            Boolean result = underTest.fromString(null);
            // then
            assertNull(result);
        }
}