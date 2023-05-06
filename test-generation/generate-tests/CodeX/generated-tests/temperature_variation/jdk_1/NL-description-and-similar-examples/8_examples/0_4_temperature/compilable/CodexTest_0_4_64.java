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


public class CodexTest_0_4_64 { 
  @Test
    public void testRemove() {
			List<String> list = new ArrayList<>();
			list.add("a");
			list.add("b");
			list.add("c");
			list.add("d");
			list.add("e");
			assertEquals("a", list.remove(0));
			assertEquals("b", list.remove(0));
			assertEquals("c", list.remove(0));
			assertEquals("d", list.remove(0));
			assertEquals("e", list.remove(0));
		}
}