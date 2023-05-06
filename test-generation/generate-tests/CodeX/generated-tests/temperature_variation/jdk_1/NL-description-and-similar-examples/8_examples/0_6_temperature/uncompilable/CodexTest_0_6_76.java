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
    public void testRemove() {
        Object o = new Object();
        list.add(o);
        assertEquals(1, list.size());
        assertEquals(o, list.get(0));
        assertEquals(o, list.remove(0));
        assertEquals(0, list.size());
    }

}