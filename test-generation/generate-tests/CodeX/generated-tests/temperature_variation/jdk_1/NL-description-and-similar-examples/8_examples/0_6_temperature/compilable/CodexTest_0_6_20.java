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


public class CodexTest_0_6_20 { 
  @Test
   public void testRemoveByIndex() {
					List<String> list = new ArrayList<String>();
					list.add("1");
					list.add("2");
					list.add("3");
					assertEquals("2", list.remove(1));
					assertEquals("1", list.remove(0));
					assertEquals("3", list.remove(0));
					assertTrue(list.isEmpty());
				}
}