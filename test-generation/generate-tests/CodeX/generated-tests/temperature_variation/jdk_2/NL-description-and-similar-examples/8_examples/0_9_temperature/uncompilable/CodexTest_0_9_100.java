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


public class CodexTest_0_9_100 { 
  @Test
    public void testContainsObject() {
        Vector vector = populatedVector(SIZE);
        for (int i=0; i<SIZE; i++) {
            assertTrue(vector.contains(new Integer(i)));
        }
        assertFalse(vector.contains(new Integer(-1)));
        assertFalse(vector.contains(null));
    }
}