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


public class CodexTest_0_3_8 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 5;
    int bits = 40;
    BitArray ba = new BitArray(bits);
    for (int i = 0; i < bits; ++i) {
      ba.set(i, i % 2 == 0);
    }
    assertEquals(5, ba.writeBytesTo(dest, offset, maxLength));
    for (int i = 0; i < 5; ++i) {
      assertEquals((byte) (0x55 << (i % 8)), dest[offset + i]);
    }
  }
}