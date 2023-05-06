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


public class CodexTest_0_6_4 { 
    @Test
    public void testEquals_shouldReturnFalseWhenEdgesDiffer() {
        // given
        Graph graph = createSimpleGraph();
        Path path1 = new Path(graph.getNode(a), graph.getEdge(ab), graph.getNode(b));
        Path path2 = new Path(graph.getNode(a), graph.getEdge(ac), graph.getNode(c));
}