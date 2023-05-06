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


public class CodexTest_0_7_91 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v = new Vector1D(2);
        Vector1D w = v.scalarMultiply(3);
        Assert.assertEquals(6.0, w.getX(), 1.0e-12);
        Assert.assertEquals(2.0, v.getX(), 1.0e-12);
        Assert.assertEquals(-2.0, v.scalarMultiply(-1).getX(), 1.0e-12);
        Assert.assertEquals(1.0, Vector1D.ZERO.scalarMultiply(2534).getX(), 1.0e-12);
    }
}