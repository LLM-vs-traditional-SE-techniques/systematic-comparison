import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
    public void testFromString() {
          for (Boolean bool : Arrays.asList(true, false)) {
              assertEquals(bool, new PrimitiveBooleanTypeDescriptor().fromString(bool.toString()));
          }
      }
}