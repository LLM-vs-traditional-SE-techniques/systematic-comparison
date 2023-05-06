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


public class CodexTest_0_9_3 { 
  @Test
    public void testWriteBytesToArray() {
		HashCode hash = HashCode.fromInt(0x1234);
		byte[] dest = new byte[8];
		assertEquals(1, hash.writeBytesTo(dest, 2, 8));
		byte[] expected = { 0, 0, 0x12, 0x34, 0, 0, 0, 0 };
		assertTrue(Arrays.equals(expected, dest));
	}
}