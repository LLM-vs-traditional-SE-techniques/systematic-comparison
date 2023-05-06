import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_3 { 
  @Test
    public void testToShort() {
      short shortValue = BooleanTypeDescriptor.toShort(TRUE);
      assertEquals(1, shortValue);
    }
}