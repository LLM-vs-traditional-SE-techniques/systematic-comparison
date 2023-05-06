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


public class CodexTest_0_8_60 { 
  @Test
        public void testAdd_whenPathsAreDifferent() {
		Graph graph = createSimpleGraph();
		Path path = new Path();
		Path path2 = new Path();
		path.setRoot(graph.getNode(a));
		path.add(graph.getEdge(ab));
		path.add(graph.getEdge(bc));
}