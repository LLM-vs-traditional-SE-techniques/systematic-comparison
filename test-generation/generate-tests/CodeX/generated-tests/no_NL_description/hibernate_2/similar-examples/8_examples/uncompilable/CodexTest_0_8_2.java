import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_2 { 
  @Test
      public void testFromString() {
          assertEquals(true, new BooleanTypeDescriptor().fromString("true"));
          assertEquals(false, new BooleanTypeDescriptor().fromString("false"));
          try {
              new BooleanTypeDescriptor().fromString("foobar");
              fail("Expected IllegalArgumentException");
          } catch (IllegalArgumentException e) {
              assertThat(e.getMessage(), equalTo("Not a boolean: foobar"));
          }
      }
}