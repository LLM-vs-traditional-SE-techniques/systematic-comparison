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


public class CodexTest_0_7_37 { 
    @Test
    public void contains_whenContainsEdge_shouldReturnTrue() {
        // given
        Graph graph = new DefaultGraph("test");
        graph.setStrict(true);
        graph.setAutoCreate(true);
        graph.addEdge("ab", "a", "b");
        Edge edge = graph.getEdge("ab");
        Path path = new Path();
}