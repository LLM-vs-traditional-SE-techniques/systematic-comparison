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


public class CodexTest_0_5_58 { 
  @Test
    public void testContains() {
        // given
        List<String> underTest = new ArrayList<>();
        underTest.add("one");
        underTest.add("two");
        // when
        boolean result = underTest.contains("one");
        // then
        assertEquals(true, result);
    }
}