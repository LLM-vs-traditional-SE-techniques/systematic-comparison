import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
      public void testFromStringTrue() {
         assertEquals(Boolean.TRUE, new BooleanTypeDescriptor().fromString("true"));
      }
      public void testFromStringFalse() {
         assertEquals(Boolean.FALSE, new BooleanTypeDescriptor().fromString("false"));
      }
      public void testFromStringEmptyString() {
         assertNull(new BooleanTypeDescriptor().fromString(""));
      }
      public void testFromStringNull() {
         assertNull(new BooleanTypeDescriptor().fromString(null));
      }
}