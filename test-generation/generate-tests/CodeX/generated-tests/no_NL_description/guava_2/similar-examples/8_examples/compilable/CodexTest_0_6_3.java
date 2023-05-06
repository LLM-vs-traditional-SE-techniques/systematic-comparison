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


public class CodexTest_0_6_3 { 
  @Test
    public void testWriteBytesTo() {
    byte[] expected = new byte[]{(byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef};
    byte[] actual = new byte[expected.length];
    HashCode hashCode = HashCode.fromBytes(expected);
    int numBytes = hashCode.writeBytesTo(actual, 0, actual.length);
    assertEquals(expected.length, numBytes);
    assertEquals(HashCode.fromBytes(expected), HashCode.fromBytes(actual));
  }
}