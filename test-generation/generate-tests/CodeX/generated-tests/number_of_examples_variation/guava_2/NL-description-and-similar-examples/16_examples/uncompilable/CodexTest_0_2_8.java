import com.google.common.hash.*;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

import static com.google.common.io.BaseEncoding.base16;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_8 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    assertEquals(2, new BitArray(new boolean[] {true, false, false, false, false, false, false, false, false, false}).writeBytesTo(dest, 0, 2));
    assertEquals(0x80, dest[0]);
    assertEquals(0x00, dest[1]);
    assertEquals(2, new BitArray(new boolean[] {true, false, false, false, false, false, false, false, false, false}).writeBytesTo(dest, 0, 3));
    assertEquals(0x80, dest[0]);
    assertEquals(0x00, dest[1]);
    assertEquals(0x00, dest[2]);
    assertEquals(2, new BitArray(new boolean[] {true, false, false, false, false, false, false, false, false, false}).writeBytesTo(dest, 1, 2));
    assertEquals(0x00, dest[0]);
    assertEquals(0x80, dest[1]);
    assertEquals(0x00, dest[2]);
    assertEquals(2, new BitArray(new boolean[] {true, false, false, false, false, false, false, false, false, false}).writeBytesTo(dest, 1, 3));
    assertEquals(0x00, dest[0]);
    assertEquals(0x80, dest[1]);
    assertEquals(0x00, dest[2]);
    assertEquals(0x00, dest[3]);
    assertEquals(2, new BitArray(new boolean[] {true, false, false, false, false, false, false, false, false, false}).writeBytesTo(dest, 2, 2));
    assertEquals(0x00, dest[0]);
    assertEquals(0x00, dest[1]);
    assertEquals(0x80, dest[2]);
    assertEquals(0x00, dest[3]);
    assertEquals(2, new BitArray(new boolean[] {true, false, false
}