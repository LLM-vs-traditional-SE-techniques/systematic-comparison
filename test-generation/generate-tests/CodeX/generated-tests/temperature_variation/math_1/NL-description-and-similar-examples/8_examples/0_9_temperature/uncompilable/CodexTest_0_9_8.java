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


public class CodexTest_0_9_8 { 
  @Test
    public void testScalarMultiplication() {
        double epsilon = 1e-14;
        Vector1D v = new Vector1D(5, 4);
        Vector1D vCopy = new Vector1D(v);
        v = v.scalarMultiply(2);
        Assert.assertEquals(v.getX(), 10, epsilon);
        Assert.assertEquals(v.getY(), 8, epsilon);
        v = vCopy.scalarMultiply(0.5);
        Assert.assertEquals(v.getX(), 2.5, epsilon);
        Assert.assertEquals(v.getY(), 2, epsilon);
    }
}