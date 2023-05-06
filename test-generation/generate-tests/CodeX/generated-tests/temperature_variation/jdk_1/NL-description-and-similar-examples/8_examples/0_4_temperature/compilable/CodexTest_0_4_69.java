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


public class CodexTest_0_4_69 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Assert.assertEquals(new Integer(1), list.remove(0));
        Assert.assertEquals(new Integer(2), list.remove(0));
        Assert.assertEquals(new Integer(3), list.remove(0));
        Assert.assertEquals(new Integer(4), list.remove(0));
        Assert.assertEquals(new Integer(5), list.remove(0));
    }
}