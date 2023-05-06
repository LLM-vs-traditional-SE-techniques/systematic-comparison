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


public class CodexTest_0_8_2 { 
    @Test
    public void contains_returnsTrueWhenEdgeIsInEdgePath() {
        // given
        Path path = new Path();
        Edge edge = mock(Edge.class);
        path.addEdge(edge);
        // when
        boolean result = path.contains(edge);
        // then
        assertTrue(result);
    }
}