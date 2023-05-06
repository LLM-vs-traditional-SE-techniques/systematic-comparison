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


public class CodexTest_0_2_47 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    BitArray ba = BitArray.create(new byte[] {(byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF}, 32);
    assertEquals(4, ba.writeBytesTo(dest, 0, 4));
    assertEquals(0xFF, dest[0]);
    assertEquals(0xFF, dest[1]);
    assertEquals(0xFF, dest[2]);
    assertEquals(0xFF, dest[3]);
    assertEquals(0, dest[4]);
    assertEquals(0, dest[5]);
    assertEquals(0, dest[6]);
    assertEquals(0, dest[7]);
  }
}