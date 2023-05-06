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


public class CodexTest_0_2_2 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = new byte[10];
    int written = writeBytesTo(bytes, 0, 10);
    assertEquals(10, written);
    assertEquals(0, bytes[0]);
    assertEquals(0, bytes[1]);
    assertEquals(0, bytes[2]);
    assertEquals(0, bytes[3]);
    assertEquals(0, bytes[4]);
    assertEquals(0, bytes[5]);
    assertEquals(0, bytes[6]);
    assertEquals(0, bytes[7]);
    assertEquals(0, bytes[8]);
    assertEquals(0, bytes[9]);
  }
}