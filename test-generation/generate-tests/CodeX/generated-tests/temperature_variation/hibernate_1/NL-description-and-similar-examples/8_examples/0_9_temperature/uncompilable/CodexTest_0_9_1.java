import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_1 { 
   @Test
   public void testToShort() {
     assertEquals(new Short(Byte.MAX_VALUE), converters.toShort(new Boolean(true)));
   }

}