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


public class CodexTest_0_3_13 { 
  @Test
  public void testWriteBytesTo() {
    byte[] dest = new byte[4];
    int writtenBytes = Ints.MAX_POWER_OF_TWO.writeBytesTo(dest, 0, dest.length);
    assertEquals(4, writtenBytes);
    assertEquals(0x7f, dest[0]);
    assertEquals(0xff, dest[1]);
    assertEquals(0xff, dest[2]);
    assertEquals(0xff, dest[3]);
  }
}