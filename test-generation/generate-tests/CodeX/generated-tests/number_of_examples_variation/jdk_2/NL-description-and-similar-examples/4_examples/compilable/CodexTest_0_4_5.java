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


public class CodexTest_0_4_5 { 
  @Test
    public void testContains() {
        // given
        List<Object> underTest = new ArrayList<Object>();
        underTest.add(new Object());
        // when
        boolean result = underTest.contains(new Object());
        // then
        assertFalse(result);
    }
}