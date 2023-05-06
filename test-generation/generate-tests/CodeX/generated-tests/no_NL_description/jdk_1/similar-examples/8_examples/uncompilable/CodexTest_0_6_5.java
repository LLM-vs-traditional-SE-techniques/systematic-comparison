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


public class CodexTest_0_6_5 { 
  @Test
    public void removeRange() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
            list.add(i);
        list.removeRange(5, 10);
        Assert.assertEquals(10, list.size());
        for (int i = 0; i < 5; i++)
            Assert.assertEquals(i, list.get(i).intValue());
        for (int i = 10; i < 20; i++)
            Assert.assertEquals(i, list.get(i-5).intValue());
    }
}