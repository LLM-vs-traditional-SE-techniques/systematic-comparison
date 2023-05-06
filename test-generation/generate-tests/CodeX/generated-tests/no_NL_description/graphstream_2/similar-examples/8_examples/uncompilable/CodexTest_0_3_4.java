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


public class CodexTest_0_3_4 { 
    @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        assertTrue(p1.equals(p2));
        p1.setRoot(new Node("a"));
        assertFalse(p1.equals(p2));
        p2.setRoot(new Node("a"));
        assertTrue(p1.equals(p2));
        p1.add(new Edge("ab", new Node("a"), new Node("b")));
        assertFalse(p1.equals(p2));
        p2.add(new Edge("ab", new Node("a"), new Node("b")));
        assertTrue(p1.equals(p2));
        p1.add(new Edge("bc", new Node("b"), new Node("c")));
        assertFalse(p1.equals(p2));
        p2.add(new Edge("bc", new Node("b"), new Node("c")));
        assertTrue(p1.equals(p2));
        p1.add(new Edge("cd", new Node("c"), new Node("d")));
        assertFalse(p1.equals(p2));
        p2.add(new Edge("cd", new Node("c"), new Node("d")));
        assertTrue(p1.equals(p2));
    }
}