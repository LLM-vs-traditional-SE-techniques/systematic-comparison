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


public class CodexTest_0_6_2 { 
  @Test
  public void testLike2D() {
    double[][] arrMatrix = 
    { 
      { 1, 2, 3, 4, 5, 6},
      { 2, 3, 4, 5, 6, 7}
    };
    DoubleFactory2D f = DoubleFactory2D.dense;
    DoubleMatrix1D vector = new DenseDoubleMatrix1D(new double[] {1,2,3,4,5,6});
    DoubleMatrix2D matrix = f.make(arrMatrix);
    DoubleMatrix2D res = vector.like2D(matrix.rows(), matrix.columns());
    
    matrix.zMult(vector,res);
    
    Assert.assertEquals(res.toString(), new DenseDoubleMatrix2D(arrMatrix).toString());
  }
}