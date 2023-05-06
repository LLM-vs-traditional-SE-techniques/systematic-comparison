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


public class CodexTest_0_9_37 { 
  @Test
  public void testRemoveInvalidIndex() {
	   try {
		   new ArrayList<>().remove(-1);
		   fail("No exception thrown for invalid index.");
	   } catch (IndexOutOfBoundsException e) {
		   // Expected
	   }
   }
}