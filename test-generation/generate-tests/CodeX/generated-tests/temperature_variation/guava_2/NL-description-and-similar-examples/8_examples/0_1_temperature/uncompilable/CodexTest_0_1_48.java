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


public class CodexTest_0_1_48 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 5;
    int bits = bits();
    int bytes = bits / 8;
    int minLength = Math.min(maxLength, bytes);
    byte[] expected = new byte[minLength];
    writeBytesToImpl(expected, 0, minLength);
    int written = writeBytesTo(dest, offset, maxLength);
    assertEquals(minLength, written);
    for (int i = 0; i < minLength; i++) {
      assertEquals(expected[i], dest[offset + i]);
    }
  }
}