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


public class CodexTest_0_8_34 { 
  @Test
  public void testWritesLeadingZerosToByteArray() {
    byte[] dest = new byte[4];
    HashCode hash = HashCode.fromLong(0x1234ABCD);
    int bytesWritten = hash.writeBytesTo(dest, 1, 2);
    assertEquals(bytesWritten, 2);
    assertThat(dest).asList().containsExactly(0, 0x34, (byte) 0xAB, 0).inOrder();
  }
}