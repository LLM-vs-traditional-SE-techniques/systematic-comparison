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


public class CodexTest_0_6_8 { 
  @Test
     public void testAssignDoubleProcedure() {
        double[] values = {1, -2, 0, 3, 0, 4};
        DoubleMatrix1D m = new DenseDoubleMatrix1D(values).viewFlip();
        m.assign(new DoubleProcedure() {
            public boolean apply(double element) {
                return element > 0;
            }
        });
        assertEquals(values[0], m.get(0), TOLERANCE);
        assertEquals(values[1], m.get(1), TOLERANCE);
        assertEquals(values[2], m.get(2), TOLERANCE);
        assertEquals(0, m.get(3), TOLERANCE);
        assertEquals(0, m.get(4), TOLERANCE);
        assertEquals(values[5], m.get(5), TOLERANCE);
    }
}