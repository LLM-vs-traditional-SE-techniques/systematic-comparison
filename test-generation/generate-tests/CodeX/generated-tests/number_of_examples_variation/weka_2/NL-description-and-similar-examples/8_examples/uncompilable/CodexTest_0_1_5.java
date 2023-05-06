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


public class CodexTest_0_1_5 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new DenseInstance(1), 0);
			model.insertAttributeAt(new Attribute("A"), 0);
			model.insertAttributeAt(new Attribute("B"), 1);
			model.insertAttributeAt(new Attribute("C"), 2);
			model.insertAttributeAt(new Attribute("D"), 3);
			model.insertAttributeAt(new Attribute("E"), 4);
			model.insertAttributeAt(new Attribute("F"), 5);
			model.insertAttributeAt(new Attribute("G"), 6);
			model.insertAttributeAt(new Attribute("H"), 7);
			model.insertAttributeAt(new Attribute("I"), 8);
			model.insertAttributeAt(new Attribute("J"), 9);
			model.insertAttributeAt(new Attribute("K"), 10);
			model.insertAttributeAt(new Attribute("L"), 11);
			model.insertAttributeAt(new Attribute("M"), 12);
			model.insertAttributeAt(new Attribute("N"), 13);
			model.insertAttributeAt(new Attribute("O"), 14);
			model.insertAttributeAt(new Attribute("P"), 15);
			model.insertAttributeAt(new Attribute("Q"), 16);
			model.insertAttributeAt(new Attribute("R"), 17);
			model.insertAttributeAt(new Attribute("S"), 18);
			model.insertAttributeAt(new Attribute("T"), 19);
			model.insertAttributeAt(new Attribute("U"), 20);
			model.insertAttributeAt(new Attribute("V"), 21);
			model.insertAttributeAt(new Attribute("W"), 22);
			model.insertAttributeAt(new Attribute("X"), 23);

}