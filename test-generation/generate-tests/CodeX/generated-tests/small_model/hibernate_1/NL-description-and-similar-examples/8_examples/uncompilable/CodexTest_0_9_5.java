import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
  public void testToShort() {
    assertEquals((short) 3, obj.toShort(true));
    assertEquals((short) 5, obj.toShort(false));
    assertEquals((short) 0, obj.toShort(null));
  }
}