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


public class CodexTest_0_7_62 { 
  @Test
    public void testRemoveAll() {
			ArrayList<String> list = new ArrayList<String>();
			list.add("1");
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("5");
			list.remove(1);
			list.remove(2);
			list.remove(3);
			assertEquals(true, list.contains("1"));
			assertFalse(list.contains("2"));
			assertEquals(true, list.contains("3"));
			assertFalse(list.contains("4"));
			assertEquals(true, list.contains("5"));
}
}