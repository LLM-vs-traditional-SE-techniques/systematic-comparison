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


public class CodexTest_0_6_3 { 
  @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        assertEquals("Hello", list.remove(0));
        assertEquals("World", list.get(0));
    }
}