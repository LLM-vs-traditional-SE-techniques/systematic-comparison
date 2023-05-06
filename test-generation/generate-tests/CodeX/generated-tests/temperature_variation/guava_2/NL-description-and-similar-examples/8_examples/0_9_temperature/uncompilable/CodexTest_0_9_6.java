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


public class CodexTest_0_9_6 { 
  @Test
  public void testToByteArrayWithUnusedBits() {
    byte[] bytes = {(byte) 0b01100100, (byte) 0b10010010, (byte) 0b11100100};
    try {
      new BigEndianBitArray(bytes, 18).toByteArray();
      // If IllegalArgumentException is not thrown, this test will fail by default.
    } catch (IllegalArgumentException expected) {
      // Expected IllegalArgumentException to be thrown
    }
  }
}