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


public class CodexTest_0_8_7 { 
  @Test
    public void testContainsWhenContainsGivenElementShouldReturnTrue() throws Exception {
        // given
        List<String> underTest = new ArrayList<String>();
        underTest.add("element");
        // when
        boolean result = underTest.contains("element");
        // then
        assertTrue(result);
    }
}