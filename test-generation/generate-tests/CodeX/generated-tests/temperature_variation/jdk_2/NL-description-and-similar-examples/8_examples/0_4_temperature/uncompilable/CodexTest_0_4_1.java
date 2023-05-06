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


public class CodexTest_0_4_1 { 
  @Test
    public void testContains() {
        assertFalse(list.contains(null));
        assertTrue(list.contains(0));
        assertFalse(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));
        assertTrue(list.contains(4));
        assertFalse(list.contains(5));
        assertFalse(list.contains(6));
        assertFalse(list.contains(7));
        assertFalse(list.contains(8));
    }
}