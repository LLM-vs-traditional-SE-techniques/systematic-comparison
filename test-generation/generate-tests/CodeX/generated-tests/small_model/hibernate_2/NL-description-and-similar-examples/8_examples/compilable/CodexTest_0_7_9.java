import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_9 { 
  @Test
  public void testFromStringWithTrue() {
		assertEquals( Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString( "true" ) );
	}
}