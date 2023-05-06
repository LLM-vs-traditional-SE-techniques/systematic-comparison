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


public class CodexTest_0_3_38 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        Path p2 = new Path();
        p1.add(null, new Edge("a", "b"));
        p2.add(null, new Edge("a", "b"));
        assertTrue(p1.equals(p2));
        p1.add(null, new Edge("b", "c"));
        p2.add(null, new Edge("b", "c"));
        assertTrue(p1.equals(p2));
        p1.add(null, new Edge("c", "d"));
        p2.add(null, new Edge("c", "d"));
        assertTrue(p1.equals(p2));
    }
}