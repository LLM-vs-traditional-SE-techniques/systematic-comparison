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


public class CodexTest_0_3_2 { 
  @Test
    public void testGetAsInstance() {
        Instances model = null;
        Random random = null;
        Instance result = fixture.getAsInstance(model, random);
        assertNotNull(result);
    }
}