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


public class CodexTest_0_3_6 { 
  @Test
    public void testLike2D() {
        DoubleMatrix2D matrix = DoubleFactory2D.dense.make(new double[][]{{1, 2, 3}, {4, 5, 6}});
        DoubleMatrix2D res = matrix.like2D(matrix.rows(), matrix.columns());
        matrix.zMult(matrix, res);
        assertEquals(14, res.getQuick(0, 0), 0);
        assertEquals(32, res.getQuick(0, 1), 0);
        assertEquals(50, res.getQuick(0, 2), 0);
        assertEquals(32, res.getQuick(1, 0), 0);
        assertEquals(77, res.getQuick(1, 1), 0);
        assertEquals(122, res.getQuick(1, 2), 0);
    }
}