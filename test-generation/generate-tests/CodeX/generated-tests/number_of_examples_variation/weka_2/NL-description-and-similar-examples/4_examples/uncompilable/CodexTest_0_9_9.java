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


public class CodexTest_0_9_9 { 
  @Test
    priority
    1
    class
    wl.WekaUtils
    statement
    addInstance(m_Elements, 2, "22.1,123.4,43.4,33.4", 1, 0)
    method
    weka.core.Utils.addInstance
Input: public Instance getAsInstance(Instances model, Random random) 
    throws Exception {
    Instance newInst = null;
    if (m_Elements != null) {
      newInst = new DenseInstance(model.numAttributes());
      newInst.setDataset(model);
            for (int j = 0, i = 0; i < model.numAttributes(); i++) {
	if (model.attribute(i).isNumeric()) {
	  if (j >= m_Elements.length)
	    throw new Exception("Datatypes are not compatible."); 
	  newInst.setValue(i, m_Elements[j++]);
	}
	if (model.attribute(i).isNominal()) {
	  int newVal = (int) 
	    (random.nextDouble() * (double) (model.attribute(i).numValues()));
	  if (newVal == (int) model.attribute(i).numValues())
	    newVal -= 1;
	  newInst.setValue(i, newVal);
	}
      }
    }
    return newInst;
  }
output:
    priority
    1
    class
    wl.WekaUtils
    statement
    addInstance(m_Elements, 1, "22.1,123.4,43.4,33.4", 2, 0)
    method
    weka.core.Utils.addInstance
}