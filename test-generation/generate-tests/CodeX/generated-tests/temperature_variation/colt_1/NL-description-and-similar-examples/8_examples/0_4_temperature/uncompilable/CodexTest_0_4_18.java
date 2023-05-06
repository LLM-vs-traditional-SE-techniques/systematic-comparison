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


public class CodexTest_0_4_18 { 
  @Test
    public void testAssign() {
		DoubleMatrix1D a = new DenseDoubleMatrix1D(SIZE);
		DoubleMatrix1D b = new DenseDoubleMatrix1D(SIZE);
		for (int i=SIZE; --i >= 0; ) {
			a.setQuick(i,Math.random());
			b.setQuick(i,Math.random());
		}
		a.assign(b);
		for (int i=SIZE; --i >= 0; ) {
			assertEquals(a.getQuick(i),b.getQuick(i),TOL);
		}
	}
}