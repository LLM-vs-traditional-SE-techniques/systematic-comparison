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


public class CodexTest_0_5_32 { 
  @Test
    public void testAssign() {
        DoubleMatrix1D m = new DenseDoubleMatrix1D(SIZE);
        DoubleMatrix1D n = new DenseDoubleMatrix1D(SIZE);
        for (int i = 0; i < SIZE; ++i) {
            m.setQuick(i, Math.random());
            n.setQuick(i, Math.random());
        }
        m.assign(n);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(n.getQuick(i), m.getQuick(i), TOL);
        }
}