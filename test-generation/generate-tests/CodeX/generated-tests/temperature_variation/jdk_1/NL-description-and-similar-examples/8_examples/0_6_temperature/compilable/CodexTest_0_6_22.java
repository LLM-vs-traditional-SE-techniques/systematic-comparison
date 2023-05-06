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


public class CodexTest_0_6_22 { 
  @Test
    public void testRemove() {
        for (int i = 0; i < 100; i++) {
            Collection<Integer> c = new ArrayList<Integer>();
            for (int j = 0; j < i; j++) c.add(j);
            for (int j = 0; j < i; j++)
                assertEquals(new Integer(j), c.remove(0));
        }
    }
}