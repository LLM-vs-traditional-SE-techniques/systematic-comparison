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


public class CodexTest_0_9_7 { 
  @Test
  public void testHashCodeBase64() throws IOException {
    BaseEncoder base64 = new Base64();
    Base64Dialect scope = new Base64Dialect(
        base64.decode("AAMAAgBEBIC3UFzA9CBIN=".getBytes("UTF-8")));
    String output = scope.encode("12.5".getBytes("UTF-8"));
    assertEquals("AAMAAgBEBIC3UFzA9CBIN=", output);
  }
}
}