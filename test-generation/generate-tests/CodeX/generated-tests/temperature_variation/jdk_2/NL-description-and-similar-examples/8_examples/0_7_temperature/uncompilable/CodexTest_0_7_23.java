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


public class CodexTest_0_7_23 { 
  @Test
    public void testContainsObject() {
        HashSet<Integer> s = populatedSet(3);
        for (int i = 0; i < 3; i++) {
            assertTrue(s.contains(i));
        }
        assertFalse(s.contains(INVALID));
    }
}