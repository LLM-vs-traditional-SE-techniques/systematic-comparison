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


public class CodexTest_0_8_1 { 
  @Test
    public void testPathEquals1() {
        Graph g = createSimpleGraph();
        Path p = new Path();
        p.setRoot(g.getNode(a));
        p.add(g.getEdge(ab));
        p.add(g.getEdge(bc));
        p.add(g.getEdge(cd));
}