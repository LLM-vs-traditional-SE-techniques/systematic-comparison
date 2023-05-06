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


public class CodexTest_0_4_49 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int numBytes = bits() / 8;
    assertEquals(numBytes, writeBytesTo(dest, 0, numBytes));
    byte[] expectedBytes = getBytes();
    assertEquals(numBytes, expectedBytes.length);
    assertEquals(numBytes, dest.length);
    for (int i = 0; i < numBytes; i++) {
      assertEquals(expectedBytes[i], dest[i]);
    }
  }
}