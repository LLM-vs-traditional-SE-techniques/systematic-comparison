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


public class CodexTest_0_2_60 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 5;
    int bits = bits();
    int length = Math.min(maxLength, bits / 8);
    byte[] bytes = new byte[length];
    for (int i = 0; i < length; i++) {
      bytes[i] = (byte) (i + 1);
    }
    BitArray array = BitArray.fromBytes(bytes);
    int written = array.writeBytesTo(dest, offset, maxLength);
    assertEquals(length, written);
    for (int i = 0; i < length; i++) {
      assertEquals(bytes[i], dest[offset + i]);
    }
  }
}