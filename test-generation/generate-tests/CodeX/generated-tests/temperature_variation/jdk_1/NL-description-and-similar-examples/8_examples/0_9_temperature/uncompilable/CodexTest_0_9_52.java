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


public class CodexTest_0_9_52 { 
  @Test
    public void testObjectRemove() throws Exception {
        Object[] a = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        Object removeE = "3";
        int index = 3;
        List list = new ArrayList(Arrays.asList(a));
        list.remove(index);
}