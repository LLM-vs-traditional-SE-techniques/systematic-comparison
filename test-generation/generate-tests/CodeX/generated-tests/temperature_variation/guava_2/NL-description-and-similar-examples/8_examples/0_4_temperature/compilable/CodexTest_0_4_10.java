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
    byte[] dest = new byte[3];
    int offset = 1;
    int maxLength = 2;
    byte[] bytes = new byte[] {1, 2, 3};
    HashCode hashCode = HashCode.fromBytes(bytes);
    int bytesWritten = hashCode.writeBytesTo(dest, offset, maxLength);
    assertEquals(2, bytesWritten);
    assertEquals(1, dest[0]);
    assertEquals(2, dest[1]);
    assertEquals(0, dest[2]);
  }
}