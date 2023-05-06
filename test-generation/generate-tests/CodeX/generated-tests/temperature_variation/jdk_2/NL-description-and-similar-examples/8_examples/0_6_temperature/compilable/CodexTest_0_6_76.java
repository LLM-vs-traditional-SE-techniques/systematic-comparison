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


public class CodexTest_0_6_76 { 
  @Test
    public void testContains_null() {
        List<Object> list = new ArrayList<Object>();
        assertFalse(list.contains(null));
        list.add(null);
        assertTrue(list.contains(null));
        assertFalse(list.contains(new Object()));
        assertFalse(list.contains(""));
        assertFalse(list.contains(1));
    }
}