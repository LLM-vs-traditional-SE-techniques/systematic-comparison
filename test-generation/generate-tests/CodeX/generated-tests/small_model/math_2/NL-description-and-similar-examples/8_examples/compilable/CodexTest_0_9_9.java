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


public class CodexTest_0_9_9 { 
  @Test
  public void testDistanceSq() {
    Vector1D v1 = new Vector1D(1);
    Vector1D v2 = new Vector1D(-4);
    final double tol = 1.0e-10;
    assertEquals(0.0, Vector1D.distanceSq(new Vector1D(-1), new Vector1D(-1)), tol);
    assertEquals(5.0, Vector1D.distanceSq(v1, v2), tol);
    assertEquals(5.0, Vector1D.distanceSq(v1, v2), tol);
    assertEquals(2.0, Vector1D.distanceSq(v1, v1), tol);
    assertEquals(2.0, Vector1D.distanceSq(v2, v2), tol);
  }
}