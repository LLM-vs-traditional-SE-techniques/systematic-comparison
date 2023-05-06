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


public class CodexTest_0_3_7 { 
  @Test
    public void testRemove() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        for (int i = 0; i < 100; i += 2) {
            Integer x = list.remove(i);
            assertEquals(i, x.intValue());
        }
        for (int i = 0; i < 50; i++) {
            assertEquals(2 * i + 1, list.get(i).intValue());
        }
    }
}