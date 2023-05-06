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


public class CodexTest_0_6_52 { 
  @Test
    public void testEqualNodes() {
        Path p1 = new Path();
        Path p2 = new Path();
        Graph graph1 = createSimpleGraph();
        Graph graph2 = createSimpleGraph();
        p1.setRoot(graph1.getNode(a));
        p2.setRoot(graph2.getNode(a));
        p1.add(graph1.getEdge(ab));
        p2.add(graph2.getEdge(ab));
        assertTrue(p1.equals(p2));
        p1.add(graph1.getEdge(bc));
        p2.add(graph2.getEdge(bc));
        assertTrue(p1.equals(p2));
        p1.add(graph1.getEdge(cd));
        p2.add(graph2.getEdge(cd));
        assertTrue(p1.equals(p2));
    }
}