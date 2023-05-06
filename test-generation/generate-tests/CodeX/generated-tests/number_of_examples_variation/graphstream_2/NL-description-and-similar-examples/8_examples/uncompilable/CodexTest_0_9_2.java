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


public class CodexTest_0_9_2 { 
    @Test
    public void equals_shouldReturnTrueWhenSameRootDifferentEdges() {
        // given
        Path p1 = new Path();
        Path p2 = new Path();
        Graph graph = createSimpleGraph();
        p1.setRoot(graph.getNode("a"));
        p2.setRoot(graph.getNode("a"));
}