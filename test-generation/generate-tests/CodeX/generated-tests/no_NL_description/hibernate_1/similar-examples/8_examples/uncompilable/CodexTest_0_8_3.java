import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_3 { 
  @Test
  public Short toShort(Boolean value) {
		return (short) toInt( value );
	}
}
@RunWith( JUnitParamsRunner.class )
public class BooleanToShortConverterTest {
}