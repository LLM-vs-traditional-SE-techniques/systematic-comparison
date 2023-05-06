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


public class CodexTest_0_6_8 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v = new Vector1D(5);
        Vector1D v2 = new Vector1D(-4);
        Assert.assertEquals(0.0, v.scalarMultiply(0.0).getNorm(), 0);
        Assert.assertEquals(25, v.scalarMultiply(-5.0).getNorm(), 1.0e-12);
        Assert.assertEquals(Vector1D.distance(v, v2), v.subtract(v2).getNorm(), 1.0e-12);
    }
}