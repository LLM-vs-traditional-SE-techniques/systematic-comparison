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


public class CodexTest_0_5_6 { 
  @Test
    public void testAssignDoubleMatrix1D() {
		double[] values = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
		DoubleMatrix1D m1 = new DenseDoubleMatrix1D(values);
		DoubleMatrix1D m2 = new DenseDoubleMatrix1D(values.length);
		m2.assign(m1);
		for (int i = 0; i < values.length; i++) {
			assertEquals("m2[" + i + "]", values[i], m2.get(i));
		}
	}
}