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


public class CodexTest_0_6_36 { 
    @Test
    public void testContainsShouldReturnTrueIfObjectIsFound() {
        // given
        Set<Object> underTest = new HashSet<Object>();
        Object o = new Object();
        underTest.add(o);
        // when
        boolean result = underTest.contains(o);
        // then
        assertTrue(result);
    }
}