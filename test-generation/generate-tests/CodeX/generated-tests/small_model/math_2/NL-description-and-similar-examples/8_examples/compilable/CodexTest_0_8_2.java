import org.apache.commons.math3.geometry.euclidean.oned.*;
import java.text.NumberFormat;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Point;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_2 { 
  @Test
  public void testDistanceSq() {
    double[] d = {100, 10};
    Vector1D v1 = new Vector1D(d[0]);
    Vector1D v2 = new Vector1D(d[1]);
    assertEquals(100, Vector1D.distanceSq(new Vector1D(100), new Vector1D(100)), 0);
    assertEquals(101, Vector1D.distanceSq(new Vector1D(100), new Vector1D(101)), 1.0e-12);
    assertEquals(d[0] * d[0] + d[1] * d[1], Vector1D.distanceSq(v1, v2), 1.0e-12);
    assertEquals(v1.subtract(v2).getNormSq(), Vector1D.distanceSq(v1, v2), 1.0e-12);
  }
}