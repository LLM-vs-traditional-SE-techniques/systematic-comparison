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


public class CodexTest_0_7_60 { 
  @Test
  public void testHash32() {
    int[] expected = {
      0x00000000, 0xF53E0E24, 0x55E94D82, 0xF5B49B6E, 0xD3910DAC, 0x072A1BC0, 0xA7F2DC06, 0x53C56D9A,
      0x814D3614, 0xE4A4A798, 0x4C7EEF4E, 0xE857A62A, 0x3ECF45BC, 0x7A76D430, 0xFA2E9CF6, 0x3E27A9DA,
      0x2E54F7C3, 0xA6A1C787, 0x46F98E51, 0x622D975D, 0xF6FB7AFF, 0xA6A6F5DB, 0xF6FF5A37, 0x6226B9F1,
      0x2E5BDC6D, 0xE28546B9, 0x4E5F8E67, 0xE4A81893, 0x8104E111, 0x053FF35D, 0xD3835EFB, 0x01A46997,
      0xA0E2462D, 0x54DD1A81, 0xF5055357, 0xF56A34B3, 0x54B06D61, 0xA0EB2CAF, 0x01E06969, 0xD3DBF7D7,
      0x05E7A453, 0x812D5E8D, 0xE4F4B647, 0xE49BCFA3, 0x81618311, 0x051AC4DF, 0xD3C11979, 0x03CB66A7,
      0xA1112D19, 0x54C871C7, 0xF6136E7D, 0xF67C1F99, 0x54854407, 0xA15E01A9, 0x03154477, 0xD3CED
}