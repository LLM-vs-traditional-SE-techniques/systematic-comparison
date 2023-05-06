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


public class CodexTest_0_5_50 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        Integer i = list.remove(1);
        assertEquals(2, i.intValue());
        assertEquals(2, list.size());
    }
}