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
    public void testContains() {
        assertContains("contains(Object)", list1, "A");
        assertContains("contains(Object)", list1, "B");
        assertContains("contains(Object)", list1, "C");
        assertContains("contains(Object)", list1, "D");
        assertNotContains("contains(Object)", list1, "E");
        assertNotContains("contains(Object)", list1, "F");
    }
}