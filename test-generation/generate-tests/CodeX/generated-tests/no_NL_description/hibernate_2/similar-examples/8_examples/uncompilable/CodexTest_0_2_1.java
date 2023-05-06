import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_1 { 
  @Test
    public void testFromString() {
        assertEquals(Boolean.TRUE, new BooleanType().fromString("true"));
        assertEquals(Boolean.FALSE, new BooleanType().fromString("false"));
    }
}