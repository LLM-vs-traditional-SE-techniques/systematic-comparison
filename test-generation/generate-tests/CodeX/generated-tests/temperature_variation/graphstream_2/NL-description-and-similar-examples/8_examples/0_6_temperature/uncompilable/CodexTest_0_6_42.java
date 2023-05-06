import org.graphstream.graph.*;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.DefaultGraph;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_42 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        Path p3 = new Path();
        p1.add(1);
        p1.add(2);
        p1.add(3);
        p3.add(1);
        p3.add(2);
        p3.add(3);
        p2.add(1);
        assertFalse(p1.equals(p2));
        assertTrue(p1.equals(p3));
    }
}