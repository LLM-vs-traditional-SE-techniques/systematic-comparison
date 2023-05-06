import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_7 { 
  @Test
  public void testGetAsInstance() {
    Instances model = null;
    try {
      model = new Instances(new BufferedReader(new StringReader(
								"@relation test\n" +
								"@attribute a numeric\n" +
								"@attribute b numeric\n" +
								"@attribute c numeric\n" +
								"@attribute d numeric\n" +
								"@attribute e numeric\n" +
								"@attribute f numeric\n" +
								"@attribute g numeric\n" +
								"@attribute h numeric\n" +
								"@attribute i numeric\n" +
								"@attribute j numeric\n" +
								"@attribute k numeric\n" +
								"@attribute l numeric\n" +
								"@attribute m numeric\n" +
								"@
}