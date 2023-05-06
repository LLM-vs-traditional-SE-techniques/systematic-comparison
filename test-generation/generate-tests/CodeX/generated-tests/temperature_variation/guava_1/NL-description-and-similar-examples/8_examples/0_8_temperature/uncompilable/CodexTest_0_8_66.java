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


public class CodexTest_0_8_66 { 
  @Test
  public void testFromLong() {
    assertEquals(HashCode.fromLong(Long.MIN_VALUE), hashFunction.newHasher().putLong(Long.MIN_VALUE).hash());
    assertEquals(HashCode.fromLong(42L), hashFunction.newHasher().putLong(42L).hash());
    assertEquals(
        HashCode.fromLong(Long.MAX_VALUE), hashFunction.newHasher().putLong(Long.MAX_VALUE).hash());
  }
}