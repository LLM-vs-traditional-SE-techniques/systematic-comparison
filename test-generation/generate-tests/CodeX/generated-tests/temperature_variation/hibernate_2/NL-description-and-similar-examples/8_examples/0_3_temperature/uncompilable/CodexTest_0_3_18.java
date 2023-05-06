import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_18 { 
  @Test
  public void testFromString() {
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("true"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("false"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("TRUE"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("FALSE"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("t"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("f"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("T"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("F"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("y"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("n"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("Y"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("N"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("yes"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("no"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("YES"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("NO"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("1"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("0"));
    assertEqu
}