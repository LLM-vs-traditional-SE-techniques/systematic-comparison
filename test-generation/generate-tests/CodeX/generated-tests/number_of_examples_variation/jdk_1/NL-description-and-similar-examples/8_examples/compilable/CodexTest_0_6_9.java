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


public class CodexTest_0_6_9 { 
  @Test
    public void testRemoveIndex() {
        String[] data = {"1", "2", "3", "4", "5", "6"};
        List<String> list = new ArrayList<String>(Arrays.asList(data));
        list.remove(1);
        assertEquals(Arrays.asList(new String[]{"1", "3", "4", "5", "6"}), list);
    }
}