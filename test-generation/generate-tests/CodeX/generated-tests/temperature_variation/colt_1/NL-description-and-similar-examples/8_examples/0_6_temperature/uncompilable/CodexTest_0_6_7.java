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


public class CodexTest_0_6_7 { 
  @Test
    
Input: public DoubleMatrix1D assign(double[] values) {
		if (values.length != size)
			throw new IllegalArgumentException("Must have same length: length="+values.length+"size()="+size());
		int nthreads = ConcurrencyUtils.getNumberOfThreads();
		if ((nthreads > 1) && (size >= ConcurrencyUtils.getThreadsBeginN_1D())) {
			nthreads = Math.min(nthreads, size);
			Future<?>[] futures = new Future[nthreads];
			int k = size / nthreads;
			for (int j = 0; j < nthreads; j++) {
				final int firstIdx = size - j * k;
				final int lastIdx = (j == (nthreads - 1)) ? 0 : firstIdx - k;
				futures[j] = ConcurrencyUtils.submit(new Runnable() {
}