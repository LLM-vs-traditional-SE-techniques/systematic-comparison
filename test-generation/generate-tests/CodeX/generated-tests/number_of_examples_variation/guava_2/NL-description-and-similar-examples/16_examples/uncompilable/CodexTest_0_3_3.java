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


public class CodexTest_0_3_3 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[5];
    BitArray bits = new BitArray(new byte[] {(byte) 0xab, (byte) 0xcd, (byte) 0xef, (byte) 0x12});
    int numBytesWritten = bits.writeBytesTo(dest, 0, dest.length);
    assertEquals(5, numBytesWritten);
    assertEquals(0xab, dest[0]);
    assertEquals(0xcd, dest[1]);
    assertEquals(0xef, dest[2]);
    assertEquals(0x12, dest[3]);
    assertEquals(0, dest[4]);
  }
}