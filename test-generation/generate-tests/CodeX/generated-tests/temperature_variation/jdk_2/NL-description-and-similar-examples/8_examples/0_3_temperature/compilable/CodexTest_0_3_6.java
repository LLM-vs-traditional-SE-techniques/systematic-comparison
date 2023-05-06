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


public class CodexTest_0_3_6 { 
  @Test
    public void testContains() {
        // given
        List<String> underTest = new ArrayList<>();
        underTest.add("1");
        underTest.add("2");
        underTest.add("3");
        // when
        boolean result = underTest.contains("2");
        // then
        assertTrue(result);
    }
}