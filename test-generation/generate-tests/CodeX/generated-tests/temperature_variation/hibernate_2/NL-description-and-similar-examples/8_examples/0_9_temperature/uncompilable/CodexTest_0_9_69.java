import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_69 { 
  @Test
    public void testFromString() {
        Boolean expected = true;
        assertEquals(expected, BooleanType.INSTANCE.fromString(expected.toString()));
    }
}