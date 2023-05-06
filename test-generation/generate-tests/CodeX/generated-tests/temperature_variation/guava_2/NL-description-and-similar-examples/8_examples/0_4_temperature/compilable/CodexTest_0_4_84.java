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


public class CodexTest_0_4_84 { 
  @Test
  public void testWriteBytesTo_withMaxLength() {
    byte[] dest = new byte[3];
    HashCode hashCode = Hashing.sha1().hashLong(42);
    int bytesWritten = hashCode.writeBytesTo(dest, 0, 2);
    assertEquals(2, bytesWritten);
    assertEquals(0, dest[2]);
  }
}