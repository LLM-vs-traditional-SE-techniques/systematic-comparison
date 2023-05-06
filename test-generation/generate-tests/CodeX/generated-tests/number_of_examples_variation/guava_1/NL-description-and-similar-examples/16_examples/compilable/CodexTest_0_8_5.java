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


public class CodexTest_0_8_5 { 
  @Test
    // Tests the fromLong method with a long hash.
    public final void test_fromLong_Long() {
      assertEquals(0x0000000000000000L, HashCode.fromLong(0x0000000000000000L).asLong());
      assertEquals(0x123456789abcdef1L, HashCode.fromLong(0x123456789abcdef1L).asLong());
      assertEquals(0xffffffffffffffffL, HashCode.fromLong(0xffffffffffffffffL).asLong());
    }
}