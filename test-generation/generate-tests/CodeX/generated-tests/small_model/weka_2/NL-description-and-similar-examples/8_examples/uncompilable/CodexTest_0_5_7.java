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


public class CodexTest_0_5_7 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithValues1() throws Exception {
    Instance newInst = null;
    if (m_Elements != null) {
      newInst = new DenseInstance(model.numAttributes());
      newInst.setDataset(model);
      for (int i = 0, j = 0; i < model.numAttributes(); i++) {
        if (model.attribute(i).isNumeric()) {
          if (j >= m_
}