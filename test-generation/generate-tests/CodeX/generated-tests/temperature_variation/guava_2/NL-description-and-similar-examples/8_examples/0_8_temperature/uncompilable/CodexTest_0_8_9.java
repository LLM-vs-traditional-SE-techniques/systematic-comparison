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


public class CodexTest_0_8_9 { 
  @Test
  public void testWriteBytesTo_partially() {
    byte[] dest = new byte[32];
    byte[] expected = new byte[32];
    System.arraycopy(bigBytes.clone(), 0, expected, 0, 16);
    int written = big.writeBytesTo(dest, 0, 16);
    assertEquals(16, written);
    assertEquals(Bytes.asList(expected), Bytes.asList(dest));
  }
}