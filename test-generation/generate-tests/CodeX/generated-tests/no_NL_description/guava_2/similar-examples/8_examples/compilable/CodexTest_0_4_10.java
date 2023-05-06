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


public class CodexTest_0_4_10 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    HashCode hash = Hashing.sha256().hashLong(0x123456789abcdef0L);
    hash.writeBytesTo(dest, 2, 5);
    byte[] expected = new byte[10];
    System.arraycopy(hash.asBytes(), 0, expected, 2, 5);
    assertTrue(Arrays.equals(expected, dest));
  }
}