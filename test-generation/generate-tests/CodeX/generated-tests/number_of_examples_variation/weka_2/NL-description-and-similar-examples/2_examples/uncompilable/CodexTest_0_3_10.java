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


public class CodexTest_0_3_10 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
      Instances model = new Instances(new BufferedReader(new StringReader(
	"@relation test\n" +
	"@attribute a numeric\n" +
	"@attribute b numeric\n" +
	"@attribute c numeric\n" +
	"@attribute d numeric\n" +
	"@attribute e numeric\n" +
	"@data\n" +
	"1.0, 2.0, 3.0, 4.0, 5.0\n" +
	"6.0, 7.0, 8.0, 9.0, 10.0\n" +
	"11.0, 12.0, 13.0, 14.0, 15.0\n" +
	"16.0, 17.0, 18.0, 19.0, 20.0\n" +
	"21.0, 22.0, 23.0, 24.0, 25.0\n" +
	"26.0, 27.0, 28.0, 29.0, 30.0\n" +
	"31.0, 32.0
}