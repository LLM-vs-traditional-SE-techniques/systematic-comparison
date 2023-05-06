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


public class CodexTest_0_7_8 { 
  @Test
    public void testGetHashCodesWithPrecomputedInput() {
        HashFunction hf = Hashing.goodFastHash(32);
        HashFunction hf2 = Hashing.goodFastHash(32);
        assertEquals(hf.getHashCodesWithPrecomputedInput(
            "hello, world", hf.hashString("hello, world", UTF_8)),
            hf2.getHashCodesWithPrecomputedInput(
                hf2.hashString("hello, world", UTF_8), "hello, world"));
    }
}