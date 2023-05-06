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


public class CodexTest_0_9_91 { 
  @Test
    public void testCountNonZerosBySelect() {
                cern.jet.math.Mult intMult = cern.jet.math.Mult.intMult(4); 
                DenseDoubleMatrix1D DenseDoubleMatrix= new DenseDoubleMatrix1D(5); 
                DenseDoubleMatrix.assign(2.1);
                cern.jet.math.Functions F = cern.jet.math.Functions.functions; 
                DoubleMatrix1D result =
                        DenseDoubleMatrix.forEachNonZero(
                        new IntIntDoubleFunction() {
                                public double apply(int first, int second, double third) {
                                        return second == 1 ? 0 : third;
                                }
                        }
                        );
                asertdoubleEquals(result, 2.1, 2.1, 2.1, 2.1, 2.1);
                result =
                        DenseDoubleMatrix.forEachNonZero(
                        new IntIntDoubleFunction() {
                        public double apply(int first, int second, double third) {
                                return second == 1 ? 0 : third + 1;
                        }
                        }
                        );
                asertdoubleEquals(result, 3.1, 2.1, 3.1, 3.1, 3.1);
                result =
                        DenseDoubleMatrix.assign(F.neg).forEachNonZero(
                        new IntIntDoubleFunction() {
                                public double apply(int first, int second, double third) {
                                        return second == 1 ? 0 : third;
                                }
                        }
                        );
                asertdoubleEquals(result, -3.1, -2.1, -3.1, -3.1, -3.1);
                result =
                        DenseDoubleMatrix.assign(F.sin).forEachNonZero(
                        new IntIntDoubleFunction() {
                                public double apply(int first, int second, double third) {
                                        return second == 1 ? 0 : third;
                                }
                        }
                        );
                asertdoubleEquals(result, 0.9877659459927653, 0.9092974268
}