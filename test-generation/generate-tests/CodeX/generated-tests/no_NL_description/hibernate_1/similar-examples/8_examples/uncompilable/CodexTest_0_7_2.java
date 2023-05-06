import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
  public void testToShort() {
    ShortTypeDescriptor underTest = new ShortTypeDescriptor();
    assertEquals(Integer.valueOf((short) 1), underTest.toShort(Boolean.TRUE));
    assertEquals(Integer.valueOf((short) 0), underTest.toShort(Boolean.FALSE));
  }
}