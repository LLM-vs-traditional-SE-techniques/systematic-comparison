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
    byte[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    assertEquals(10, BitArray.fromBytes(new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}).writeBytesTo(dest, 0, 10));
    assertEquals(Arrays.toString(expected), Arrays.toString(dest));
  }
}