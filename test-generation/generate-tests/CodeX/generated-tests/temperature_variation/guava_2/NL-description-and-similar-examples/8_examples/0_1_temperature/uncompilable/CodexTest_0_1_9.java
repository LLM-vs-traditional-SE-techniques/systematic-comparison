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


public class CodexTest_0_1_9 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int offset = 2;
    int maxLength = 5;
    int bits = bits();
    int expectedLength = Ints.min(maxLength, bits / 8);
    int expectedReturn = expectedLength;
    int expectedEnd = offset + expectedLength;
    byte[] expected = new byte[expectedLength];
    writeBytesToImpl(expected, 0, expectedLength);
    int actualReturn = writeBytesTo(dest, offset, maxLength);
    assertEquals(expectedReturn, actualReturn);
    assertEquals(0, dest[offset - 1]);
    assertEquals(0, dest[expectedEnd]);
    for (int i = 0; i < expectedLength; i++) {
      assertEquals(expected[i], dest[offset + i]);
    }
  }
}