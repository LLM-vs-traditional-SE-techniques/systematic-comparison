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


public class CodexTest_0_5_22 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[10];
    int numBytesWritten = hashFunction.hashInt(42).writeBytesTo(bytes, 2, 6);
    assertEquals(numBytesWritten, 6);
    assertEquals(
        "0123" +
        "abcd" +
        "efgh" +
        "ijkl" +
        "mnop" +
        "qrst" +
        "uvwx" +
        "yz\0\0",
        new String(bytes, Charsets.US_ASCII));
  }
}