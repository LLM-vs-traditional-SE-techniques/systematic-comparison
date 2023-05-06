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


public class CodexTest_0_1_6 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithValuesFromVector() {
    // given
    Instance expected = new DenseInstance(2);
    expected.setDataset(new InstanceHeader(new double[] {1.0, 2.0}));
    expected.setValue(0, 1.0);
    expected.setValue(1, 2.0);
    AlgVector vector = new AlgVector(new double[] {1.0, 2.0});

}