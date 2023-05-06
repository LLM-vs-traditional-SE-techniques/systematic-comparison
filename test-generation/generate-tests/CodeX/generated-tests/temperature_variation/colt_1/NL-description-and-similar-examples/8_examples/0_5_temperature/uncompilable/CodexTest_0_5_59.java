import cern.colt.matrix.*;
import cern.colt.list.DoubleArrayList;
import cern.colt.list.IntArrayList;
import cern.colt.matrix.impl.AbstractMatrix1D;

import hep.aida.bin.*;
import cern.colt.matrix.impl.*;
import cern.colt.function.DoubleDoubleFunction;
import cern.colt.function.DoubleFunction;
import cern.colt.list.IntArrayList;
import cern.colt.map.AbstractIntDoubleMap;
import cern.colt.map.OpenIntDoubleHashMap;
import cern.colt.matrix.DoubleFactory2D;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.DoubleMatrix3D;
import cern.colt.matrix.doublealgo.DoubleMatrix2DComparator;
import cern.colt.matrix.linalg.Algebra;
import cern.colt.matrix.linalg.LUDecompositionQuick;
import cern.colt.matrix.linalg.SeqBlas;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_59 { 
  @Test
    public void testAssign() {
        DoubleMatrix1D a = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3});
        DoubleMatrix1D b = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5});
        DoubleMatrix1D c = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5});
        DoubleMatrix1D d = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5, 6, 7});
        DoubleMatrix1D e = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5, 6, 7});
        DoubleMatrix1D f = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        DoubleMatrix1D g = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        DoubleMatrix1D h = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        DoubleMatrix1D i = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        DoubleMatrix1D j = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});
        DoubleMatrix1D k = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});
        DoubleMatrix1D l = new DenseDoubleMatrix1D(new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});
        DoubleMatrix1D m = new DenseDouble
}