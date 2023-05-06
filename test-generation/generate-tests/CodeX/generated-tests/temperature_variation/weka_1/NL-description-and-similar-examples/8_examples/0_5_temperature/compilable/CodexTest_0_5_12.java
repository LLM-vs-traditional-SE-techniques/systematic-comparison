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


public class CodexTest_0_5_12 { 
  @Test
  public void testAdd() {
			AlgVector v1 = new AlgVector(new double[] {1,2,3});
			AlgVector v2 = new AlgVector(new double[] {4,5,6});
			AlgVector v3 = v1.add(v2);
			assertEquals(3, v3.numElements());
			assertEquals(5, v3.getElement(0), 0.01);
			assertEquals(7, v3.getElement(1), 0.01);
			assertEquals(9, v3.getElement(2), 0.01);
		}
}