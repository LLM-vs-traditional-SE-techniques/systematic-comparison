import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_32 { 
  @Test
    public void testToShort() {
        assertEquals((short)0, underTest.toShort(false));
        assertEquals((short)1, underTest.toShort(true));
    }
}