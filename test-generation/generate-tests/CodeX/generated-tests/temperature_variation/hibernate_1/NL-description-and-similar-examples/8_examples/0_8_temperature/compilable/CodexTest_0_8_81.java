import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_81 { 
  @Test
    public void testToShortValue() {
			BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
			Short result = underTest.toShort(true);
			Assert.assertEquals(Short.valueOf((short) 1), result);
		}
}