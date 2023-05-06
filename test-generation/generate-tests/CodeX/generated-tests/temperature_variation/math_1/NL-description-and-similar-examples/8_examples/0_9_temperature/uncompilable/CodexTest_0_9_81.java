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


public class CodexTest_0_9_81 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v = new Vector1D(1);
        Vector1D w = v.scalarMultiply(5);
        Assert.assertEquals(0.0, new Vector1D(0).scalarMultiply(5).getNorm(), 0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Vector1D(1).scalarMultiply(Double.POSITIVE_INFINITY).getNorm(), 0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, new Vector1D(-1).scalarMultiply(Double.POSITIVE_INFINITY).getNorm(), 0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Vector1D(1).scalarMultiply(Double.NEGATIVE_INFINITY).getNorm(), 0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, new Vector1D(-1).scalarMultiply(Double.NEGATIVE_INFINITY).getNorm(), 0);
        Assert.assertEquals(5.0, w.getNorm(), 1.0e-12);
        Assert.assertEquals(v.scalarMultiply(a).getNorm(), w.getNorm(), 1.0e-12);
    }
}