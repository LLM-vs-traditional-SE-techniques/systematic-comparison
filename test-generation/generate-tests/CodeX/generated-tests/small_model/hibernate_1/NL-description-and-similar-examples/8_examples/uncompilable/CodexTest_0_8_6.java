import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_6 { 
  @Test
  public void testToShort() {
    assertEquals("Unexpected short value", (short) 1, new TrueFalseToShort().toShort(Boolean.TRUE));
    assertEquals("Unexpected short value", (short) 0, new TrueFalseToShort().toShort(Boolean.FALSE));
  }
}