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


public class CodexTest_0_7_53 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(0));
        list.add(new Integer(1));
        list.remove(0);
        Assert.assertEquals(new Integer(1), list.get(0));
    }
}