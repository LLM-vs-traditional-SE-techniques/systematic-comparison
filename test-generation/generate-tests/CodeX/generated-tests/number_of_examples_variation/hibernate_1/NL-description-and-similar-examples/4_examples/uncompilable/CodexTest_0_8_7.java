import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_7 { 
  @Test
       public void testToShort() {
			Assert.assertEquals(2, (short) source.toShort((short) 2));
			Assert.assertEquals(3, (short) source.toShort((short) 3));
		}
}