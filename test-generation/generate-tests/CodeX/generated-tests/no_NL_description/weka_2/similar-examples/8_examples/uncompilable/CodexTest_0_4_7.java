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


public class CodexTest_0_4_7 { 
  @Test
    public void testGetAsInstance() {
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@relation test\n" + "@attribute a numeric\n" + "@attribute b numeric\n"
							+ "@attribute c numeric\n" + "@attribute d numeric\n" + "@attribute e numeric\n"
							+ "@attribute f numeric\n" + "@attribute g numeric\n" + "@attribute h numeric\n"
							+ "@attribute i numeric\n" + "@attribute j numeric\n" + "@attribute k numeric\n"
							+ "@attribute l numeric\n" + "@attribute m numeric\n" + "@attribute n numeric\n"
							+ "@attribute o numeric\n" + "@attribute p numeric\n" + "@attribute q numeric\n"
							+ "@attribute r numeric\n" + "@attribute s numeric\n" + "@attribute t numeric\n"
							+ "@attribute u numeric\n" + "@attribute v numeric\n" + "@attribute w numeric\n"
							+ "@attribute x numeric\n" + "@attribute y numeric\n" + "@attribute z numeric\n"
							+ "@attribute class {a,b}\n" + "@data\n" + "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,a\n"
							+ "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,b")));
			AlgVector v = new AlgVector(26);
			Random r = new Random(1);
			Instance inst = v.
}