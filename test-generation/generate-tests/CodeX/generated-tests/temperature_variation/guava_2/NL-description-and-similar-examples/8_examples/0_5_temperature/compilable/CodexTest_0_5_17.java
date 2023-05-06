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


public class CodexTest_0_5_17 { 
  @Test
  public void testWriteBytesToWithOffset() {
    byte[] dest = new byte[20];
    byte[] bytes = {(byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef};
    HashCode hashCode = HashCode.fromBytes(bytes);
    int offset = 10;
    int maxLength = bytes.length;
    int writtenBytes = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(maxLength, writtenBytes);
    for (int i = 0; i < bytes.length; i++) {
      assertEquals(bytes[i], dest[offset + i]);
    }
  }
}