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


public class CodexTest_0_6_76 { 
  @Test
    public void testContains() {
        Path path = new Path();
        Edge edge1 = new Edge("1", "a", "b", 1d, 1);
        Edge edge2 = new Edge("2", "a", "b", 1d, 1);
        Edge edge3 = new Edge("3", "a", "b", 1d, 1);
        path.add(edge1);
        path.add(edge2);
        path.add(edge3);
        assertTrue(path.contains(edge3));
        assertTrue(path.contains(edge2));
        assertTrue(path.contains(edge1));
    }
}