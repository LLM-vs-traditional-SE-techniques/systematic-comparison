import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_10 { 
  @Test
  public void testContains() {
    int len = 2;
    AlgVector v = new AlgVector(len);
    for (int i = 0; i < len; i++)
      v.setElement(i, i + 1);
    for (int i = 0; i < len; i++)
      assertTrue("Contains failed at index " + i, v.contains(i + 1));
  }

}