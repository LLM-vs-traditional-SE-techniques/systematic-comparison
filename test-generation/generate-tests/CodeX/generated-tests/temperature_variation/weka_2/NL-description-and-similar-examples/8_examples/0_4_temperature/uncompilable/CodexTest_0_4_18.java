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


public class CodexTest_0_4_18 { 
  @Test
    public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(new StringReader(
        "@relation Test\n" +
        "@attribute A numeric\n" +
        "@attribute B numeric\n" +
        "@attribute C numeric\n" +
        "@data\n" +
        "1.0, 2.0, 3.0\n" +
        "4.0, 5.0, 6.0\n" +
        "7.0, 8.0, 9.0\n" +
        "10.0, 11.0, 12.0\n" +
        "13.0, 14.0, 15.0\n" +
        "16.0, 17.0, 18.0\n" +
        "19.0, 20.0, 21.0\n" +
        "22.0, 23.0, 24.0\n" +
        "25.0, 26.0, 27.0\n" +
        "28.0, 29.0, 30.0\n" +
        "31.0, 32.0, 33.0\n" +
        "34.0, 35.0, 36.0\n" +
        "37.0, 38.0, 39.0\n" +
        "40.0, 41.0, 42.0\n" +
        "43.0, 44.0, 45.0\n" +
        "46.0, 47.0, 48.0\n" +
        "49.0, 50.0, 51.0\n" +
        "52.0, 53.0, 54.0\n" +
        "55.0, 56.0, 57.0\n" +
        "58.0, 59.0, 60.0\n" +
        "61.0, 62.0, 63.0\n" +
        "64.
}