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


public class CodexTest_0_4_46 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[8];
    int numBytes = bits() / 8;
    int offset = 0;
    int maxLength = numBytes;
    int actualLength = writeBytesTo(dest, offset, maxLength);
    assertEquals(numBytes, actualLength);
    assertEquals(numBytes, maxLength);
    assertEquals(offset + numBytes, offset + actualLength);
    assertEquals(offset + numBytes, offset + maxLength);
    assertEquals(offset + numBytes, dest.length);
    assertEquals(offset + numBytes, offset + dest.length);
    assertEquals(offset + numBytes, dest.length);
    assertEquals(offset + numBytes, dest.length);
  }
}