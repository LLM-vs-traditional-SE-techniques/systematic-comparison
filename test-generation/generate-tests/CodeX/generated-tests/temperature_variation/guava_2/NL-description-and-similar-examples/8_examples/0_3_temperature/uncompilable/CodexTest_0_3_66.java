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


public class CodexTest_0_3_66 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    BitArray bits = BitArray.create(new byte[] {0x12, 0x34, 0x56, 0x78, (byte) 0x9A, (byte) 0xBC, (byte) 0xDE, (byte) 0xF0});
    int written = bits.writeBytesTo(dest, 2, 5);
    assertEquals(5, written);
    assertEquals(0x12, dest[2]);
    assertEquals(0x34, dest[3]);
    assertEquals(0x56, dest[4]);
    assertEquals(0x78, dest[5]);
    assertEquals((byte) 0x9A, dest[6]);
  }
}