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


public class CodexTest_0_7_8 { 
  @Test
  public void testContains() {
		// given
		DefaultGraph graph = new DefaultGraph("test");
		graph.setStrict(false);
		graph.setAutoCreate(true);
		graph.addEdge("ab", "a", "b");
		graph.addEdge("bc", "b", "c");
		graph.addEdge("cd", "c", "d");
		Path path = new Path(graph.getVertex("b"), graph.getVertex("b"),
				Arrays.asList(graph.getEdge("ab"), graph.getEdge("bc")));
		// when
		boolean result = path.contains(graph.getEdge("bc"));
		// then
		assertTrue(result);
	}
}