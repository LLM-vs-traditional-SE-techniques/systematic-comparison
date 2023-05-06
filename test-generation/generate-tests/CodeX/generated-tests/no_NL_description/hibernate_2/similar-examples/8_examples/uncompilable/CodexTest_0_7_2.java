import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
    public void testInvalid() throws Exception {
		assertNull(BooleanType.INSTANCE.fromString( null ));
		assertNull(BooleanType.INSTANCE.fromString( "" ));
		assertNull(BooleanType.INSTANCE.fromString( "blah" ));
	}
}