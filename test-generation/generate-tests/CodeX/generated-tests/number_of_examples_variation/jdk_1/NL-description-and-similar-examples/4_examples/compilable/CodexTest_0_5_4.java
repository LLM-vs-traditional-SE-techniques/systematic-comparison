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


public class CodexTest_0_5_4 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[] { "a", "b", "c", "d" };
        List<Object> list = new ArrayList<>(Arrays.asList(a));
        assertEquals(a[0], list.remove(0));
        assertEquals(a[2], list.remove(1));
        assertEquals(a[3], list.remove(1));
        assertEquals(1, list.size());
        assertEquals(a[1], list.get(0));
    }
}