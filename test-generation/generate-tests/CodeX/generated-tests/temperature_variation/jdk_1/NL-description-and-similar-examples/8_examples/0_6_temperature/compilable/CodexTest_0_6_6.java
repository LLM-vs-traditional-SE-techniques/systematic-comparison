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


public class CodexTest_0_6_6 { 
  @Test
  public void testRemoveIndex() {
        try {
            // Regression for HARMONY-2072
            Vector<Object> v = new Vector<Object>();
            v.add(null);
            v.add(null);
            v.remove(2);
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }
        fail();
    }
}