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


public class CodexTest_0_9_61 { 
    @Test(expected=IndexOutOfBoundsException.class)
    public void add() {
        final List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        assertEquals(Integer.valueOf(2), list.remove(0));
        try {
            list.remove(2);
        } catch (final IndexOutOfBoundsException e) {
            // ok
            return;
        }
        // should never happen
        fail();
    }
}