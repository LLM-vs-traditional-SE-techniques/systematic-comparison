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
    public void testRemove() {
        List<String> list = new ArrayList<String>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        assertEquals(3, list.size());
        assertEquals("foo", list.remove(0));
        assertEquals(2, list.size());
        assertEquals("bar", list.remove(0));
        assertEquals(1, list.size());
        assertEquals("baz", list.remove(0));
        assertEquals(0, list.size());
    }
}