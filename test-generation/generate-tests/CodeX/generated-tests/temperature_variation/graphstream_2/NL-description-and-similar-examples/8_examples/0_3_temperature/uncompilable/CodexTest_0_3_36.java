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


public class CodexTest_0_3_36 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.add(new Edge("ab", new Node("a"), new Node("b")));
        assertFalse(p1.equals(p2));
        assertFalse(p2.equals(p1));
        p2.add(new Edge("ab", new Node("a"), new Node("b")));
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.add(new Edge("bc", new Node("b"), new Node("c")));
        assertFalse(p1.equals(p2));
        assertFalse(p2.equals(p1));
        p2.add(new Edge("bc", new Node("b"), new Node("c")));
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
    }
}