import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_7 { 
  @Test
    public void testToShort() {
		assertEquals( (short) 1, NumberUtils.toShort( Boolean.TRUE ) );
		assertEquals( (short) 0, NumberUtils.toShort( Boolean.FALSE ) );
	}
}