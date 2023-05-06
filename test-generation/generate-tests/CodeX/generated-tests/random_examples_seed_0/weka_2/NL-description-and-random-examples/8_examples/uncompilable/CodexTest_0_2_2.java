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


public class CodexTest_0_2_2 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c\n1,2,3\n4,5,6\n7,8,9\n")));
        model.setClassIndex(model.numAttributes() - 1);
        Instance instance = new DenseInstance(model.numAttributes());
        instance.setDataset(model);
        instance.setValue(0, 1);
        instance.setValue(1, 2);
        instance.setValue(2, 3);
        Instance result = instance.getAsInstance(model, new Random(1));
        assertEquals(1.0, result.value(0), 0.0);
        assertEquals(2.0, result.value(1), 0.0);
        assertEquals(3.0, result.value(2), 0.0);
    }
}