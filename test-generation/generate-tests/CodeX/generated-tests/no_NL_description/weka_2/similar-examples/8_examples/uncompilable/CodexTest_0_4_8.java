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


public class CodexTest_0_4_8 { 
    @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "test,test2\n" + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test2\n"
                        + "test,test2\n" + "test,test2\n" + "test,test
}