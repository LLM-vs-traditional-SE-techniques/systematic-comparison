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


public class CodexTest_0_5_4 { 
  @Test
    public void testLike2D() {
        DoubleFactory2D factory = DoubleFactory2D.dense;
        int rows = 2;
        int columns = 3;
        DoubleMatrix2D matrix = factory.make(rows, columns);
        DoubleMatrix2D res = matrix.like2D(matrix.rows(), matrix.columns());
        for (int r = 0; r < res.rows(); r++) {
            for (int c = 0; c < res.columns(); c++) {
                res.set(r, c, 0);
            }
        }
        System.out.println(res);
    }
}