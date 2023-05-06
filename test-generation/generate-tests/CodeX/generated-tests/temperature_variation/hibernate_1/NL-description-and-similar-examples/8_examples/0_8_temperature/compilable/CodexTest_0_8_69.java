import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_69 { 
  @Test
  public void testToShortShouldReturnZeroWhenFalseGiven() {
      // given
      BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
      // when
      short result = underTest.toShort(Boolean.FALSE);
      // then
      assertEquals(0, result);
  }
}