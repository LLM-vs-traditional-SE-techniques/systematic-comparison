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


public class CodexTest_0_9_74 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v = new Vector1D(1);
        Vector1D u = v.scalarMultiply(0.5);
        Assert.assertEquals(0.5, u.getX(), 1.0e-12);
        Assert.assertEquals(0.5 * v.getX(), v.scalarMultiply(0.5).getX(), 1.0e-12);
        Assert.assertEquals(v.scalarMultiply(0.5).getX(), v.scalarMultiply(0.5).getX(), 1.0e-12);
    }
}