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


public class CodexTest_0_8_4 { 
  @Test
    public void test1() {
        DenseDoubleMatrix2D D = new DenseDoubleMatrix2D(2, 2);
        D.setQuick(0, 0, 2);
        D.setQuick(0, 1, 5);
        D.setQuick(1, 0, 3);
        D.setQuick(1, 1, 9);
        DenseDoubleAlgebra a = new DenseDoubleAlgebra();
        org.ujmp.core.DenseDoubleMatrix2D E = a.inverse(D);
        System.out.println(D);
        System.out.println(E);
    }
}