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


public class CodexTest_0_8_8 { 
  @Test
    public void testWrongIndex() {
        try {
            Vector1D.angle(new Vector1D(0, 0, 1), new Vector1D(1, 1, 0));
            Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // expected behavior
        }
    }
}