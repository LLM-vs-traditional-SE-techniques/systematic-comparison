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


public class CodexTest_0_4_27 { 
  @Test
    public void testContains() {
        final String[] a = new String[] { "a", "b", "c" };
        final ArrayList<String> list = new ArrayList<String>(Arrays.asList(a));
        assertTrue(list.contains("a"));
        assertTrue(list.contains("b"));
        assertTrue(list.contains("c"));
        assertFalse(list.contains("d"));
    }
}