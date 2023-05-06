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


public class CodexTest_0_9_29 { 
  @Test
  public static void doubleTest28() {
      double[][] arrMatrix = {
        { 1.0, 0.0, 1.0,  2.0},
        { 0.0, 1.0, -1.0, 3.0},
        { 3.0, 0.0,  1.0, 4.0}
      };
      double[][] arrMatrix2 = {
        { 1.0, 0.0, 1.0,  2.0},
        { 0.0, 1.0, -1.0, 3.0},
        { 3.0, 0.0,  1.0, 4.0}
      };
      double[][] resArr = {
        { -2.0,  1.0, -1.0},
        { -1.0, -1.0,  2.0},
        {  2.0,  1.0, -1.0}
      };
      DoubleFactory2D f = DoubleFactory2D.dense;
      DoubleMatrix2D matrix = f.make(arrMatrix);
      DoubleMatrix2D matrix2 = f.make(arrMatrix2);
      DoubleMatrix2D res = matrix.zMult(matrix2, null);
      System.out.println(res);
    }

}