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


public class CodexTest_0_8_94 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(-4);
        Assert.assertEquals(v1.scalarMultiply(0).getNorm(), 0.0, 1.0e-12);
        Assert.assertEquals(v2.scalarMultiply(1).getNorm(), v2.getNorm(), 1.0e-12);
        Assert.assertEquals(v1.scalarMultiply(1).getNorm(), v1.getNorm(), 1.0e-12);
    }
}