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


public class CodexTest_0_8_4 { 
  @Test
   public void testGetAsInstance(Instances model, Random random) 
    throws Exception {
    Instance newInst = null;
    if (m_Elements != null) {
      newInst = new DenseInstance(model.numAttributes());
      newInst.setDataset(model);
            for (int i = 0, j = 0; i < model.numAttributes(); i++) {
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
Input: public static String toHex(byte[] bytes) {
    StringBuilder buffer = new StringBuilder(bytes.length * 2);
    for (int i = 0; i < bytes.length; i++) {
      buffer.append(CHARS[(bytes[i] >> 4) & 0x0F]);
      buffer.append(CHARS[bytes[i] & 0x0F]);
    }
    return buffer.toString();
  }
Output: public void testRetrieveFirstOfTwo() {
    String nodeId = firstNodeId();
    String otherId = otherFirstNodeId();
    String relationId = relationId(nodeId, otherId);
}