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


public class CodexTest_0_4_2 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        p1.addNode(new Node(1, "a"));
        assertFalse(p1.equals(p2));
        assertFalse(p2.equals(p1));
        p2.addNode(new Node(1, "a"));
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
    }
}