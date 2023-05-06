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


public class CodexTest_0_9_6 { 
  @Test
  public void testDoubleTestDoubleMatrix2DArrayIntInt() {
			double[][] arrMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			DoubleFactory2D f = DoubleFactory2D.dense;
			DoubleMatrix1D row = new DenseDoubleMatrix1D(3);
			DoubleMatrix2D res = f.make(arrMatrix).zMult(f.make(arrMatrix), row.like2D(arrMatrix.length, row.size()));
			Assert.assertEquals(f.make(new double[][] { { 30, 36, 42 }, { 66, 81, 96 }, { 102, 126, 150 } }), res);
		}

}