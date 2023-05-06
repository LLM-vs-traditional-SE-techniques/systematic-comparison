import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_79 { 
  @Test
  public void testFromString() {
    assertEquals(Boolean.TRUE, typeDescriptor.fromString("true"));
    assertEquals(Boolean.FALSE, typeDescriptor.fromString("false"));
  }
}