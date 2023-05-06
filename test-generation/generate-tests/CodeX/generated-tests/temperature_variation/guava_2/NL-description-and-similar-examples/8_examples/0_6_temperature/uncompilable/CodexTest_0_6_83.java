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


public class CodexTest_0_6_83 { 
  @Test
    public void testToByteArray() {
    for (int numBytes = 0; numBytes < 8; numBytes++) {
      for (int i = 0; i < (1 << numBytes * 8); i++) {
        BitSet bits = BitSet.valueOf(new long[] {i});
        byte[] bytes = bits.toByteArray();
        assertEquals(Arrays.toString(bytes), numBytes, bytes.length);
        BitSet readBack = BitSet.valueOf(bytes);
        assertEquals(bits, readBack);
      }
    }
  }
}