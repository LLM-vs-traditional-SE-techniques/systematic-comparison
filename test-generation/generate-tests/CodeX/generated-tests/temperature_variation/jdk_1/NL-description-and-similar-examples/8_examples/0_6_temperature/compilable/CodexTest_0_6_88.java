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


public class CodexTest_0_6_88 { 
  @Test
    public void testRemove() {
        final ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(2, list.remove(1).intValue());
        assertEquals(1, list.get(0).intValue());
        assertEquals(3, list.get(1).intValue());
        list.remove(0);
        assertEquals(1, list.size());
        assertEquals(3, list.get(0).intValue());
        list.remove(0);
        assertEquals(0, list.size());
    }
}