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


public class CodexTest_0_2_7 { 
  @Test
  public void testContains() {
    assertTrue(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}).contains(new Integer(2)));
    assertFalse(Arrays.asList(new Integer[] {1, 2, 3, 4, 5}).contains(new Integer(6)));
  }
}