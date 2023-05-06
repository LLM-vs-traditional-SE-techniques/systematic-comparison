import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_1 { 
  @Test
    public void testToShort() {
        assertEquals(0, NumberUtils.toShort(Boolean.FALSE));
        assertEquals(1, NumberUtils.toShort(Boolean.TRUE));
        assertEquals(0, NumberUtils.toShort("false"));
        assertEquals(1, NumberUtils.toShort("true"));
        assertEquals(1, NumberUtils.toShort("on"));
        assertEquals(0, NumberUtils.toShort("off"));
        assertEquals(0, NumberUtils.toShort("foo"));
    }
}