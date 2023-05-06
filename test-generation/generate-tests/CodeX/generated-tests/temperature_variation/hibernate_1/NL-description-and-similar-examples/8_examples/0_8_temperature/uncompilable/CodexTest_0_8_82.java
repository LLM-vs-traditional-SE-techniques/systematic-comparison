import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_82 { 
  @Test
    public void testToShort() {
        assertEquals(Short.valueOf(False), BooleanTypeDescriptor.INSTANCE.toShort(Boolean.FALSE));
        assertEquals(Short.valueOf(True), BooleanTypeDescriptor.INSTANCE.toShort(Boolean.TRUE));
    }
}