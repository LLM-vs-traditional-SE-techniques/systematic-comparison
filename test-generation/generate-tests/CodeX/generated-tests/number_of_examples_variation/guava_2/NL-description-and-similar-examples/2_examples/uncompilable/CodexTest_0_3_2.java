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


public class CodexTest_0_3_2 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[10];
    int maxLength = 5;
    int offset = 3;
    int bits = 40;
    BitArray bitArray = new BitArray(bits);
    bitArray.writeBytesTo(dest, offset, maxLength);
    for (int i = 0; i < maxLength; i++) {
      assertEquals(0, dest[offset + i]);
    }
    for (int i = maxLength; i < dest.length; i++) {
      assertEquals(0, dest[i]);
    }
  }
}