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


public class CodexTest_0_3_36 { 
  @Test
    public void testRemove() {
        final List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        list.add("t");
        list.add("u");
        list.add("v");
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("0");
        assertEquals("a", list.remove(0));
        assertEquals("b", list.remove(0));
        assertEquals("c", list.remove(0));
        assertEquals("d", list.remove(0));
        assertEquals("e", list.remove(0));
        assertEquals("f", list.remove(0));
        assertEquals("g", list.remove(0));
        assertEquals("h", list.remove(0));
        assertEquals("i", list.remove(0));
        assertEquals("j", list.remove(0));
        assertEquals("k", list.remove(0));
        assertEquals("l", list.remove(0));
        assertEquals("m", list.remove(0));
        assertEquals("n",
}