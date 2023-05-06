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


public class CodexTest_0_2_30 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int written = new BitArray(new long[] {0x12345678L, 0x9abcdef0L}).writeBytesTo(dest, 2, 3);
    assertEquals(3, written);
    assertEquals(0x45, dest[2] & 0xff);
    assertEquals(0x67, dest[3] & 0xff);
    assertEquals(0x89, dest[4] & 0xff);
  }
}