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


public class CodexTest_0_2_46 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    int offset = 0;
    int maxLength = 4;
    int expectedReturnValue = 4;
    int actualReturnValue = bitArray.writeBytesTo(dest, offset, maxLength);
    assertEquals(expectedReturnValue, actualReturnValue);
    assertArrayEquals(new byte[] {0, 0, 0, 0}, dest);
  }
}