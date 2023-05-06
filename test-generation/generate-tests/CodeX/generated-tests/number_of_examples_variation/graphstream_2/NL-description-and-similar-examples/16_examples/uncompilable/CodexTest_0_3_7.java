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


public class CodexTest_0_3_7 { 
    @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        assertTrue(p1.equals(p2));
        p1.add(graph.getNode(a));
        assertFalse(p1.equals(p2));
        p2.add(graph.getNode(a));
        assertTrue(p1.equals(p2));
        p1.add(graph.getNode(b));
        assertFalse(p1.equals(p2));
        p2.add(graph.getNode(b));
        assertTrue(p1.equals(p2));
        p1.add(graph.getNode(c));
        assertFalse(p1.equals(p2));
        p2.add(graph.getNode(c));
        assertTrue(p1.equals(p2));
        p1.add(graph.getNode(d));
        assertFalse(p1.equals(p2));
        p2.add(graph.getNode(d));
        assertTrue(p1.equals(p2));
    }
}