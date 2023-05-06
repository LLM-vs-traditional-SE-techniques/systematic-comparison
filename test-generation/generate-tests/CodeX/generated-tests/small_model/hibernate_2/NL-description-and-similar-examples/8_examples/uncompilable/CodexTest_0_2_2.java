import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_2 { 
  @Test
  public void testFromString() {
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("true", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("True", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("TRUE", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("1", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("false", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("False", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("FALSE", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("0", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("t", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("f", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("T", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("F", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("true", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("false", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("True", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("False", null));
    assertEquals(Boolean.TRUE
}