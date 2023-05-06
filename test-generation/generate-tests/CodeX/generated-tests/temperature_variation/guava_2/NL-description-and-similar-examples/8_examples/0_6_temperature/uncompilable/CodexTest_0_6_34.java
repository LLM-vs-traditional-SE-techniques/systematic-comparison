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


public class CodexTest_0_6_34 { 
  @Test
  public void testWriteBytesTo() {
    byte[] bytes = {(byte) 0xDE, (byte) 0xAD, (byte) 0xBE, (byte) 0xEF};
    ImmutableBitArray bitArray = ImmutableBitArray.create(bytes);
    byte[] output = new byte[4];
    assertEquals(4, bitArray.writeBytesTo(output, 0, 4));
    assertEquals(new byte[] {(byte) 0xDE, (byte) 0xAD, (byte) 0xBE, (byte) 0xEF}, output);
  }
}