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


public class CodexTest_0_7_17 { 
  @Test
	public void testEquality() {
		Graph graph = createSimpleGraph();
		Path p = new Path();
		p.setRoot(graph.getNode(a));
		p.add(graph.getEdge(ab));
		p.add(graph.getEdge(bc));
		p.add(graph.getEdge(cd));
		Path q = new Path();
		q.setRoot(graph.getNode(a));
		q.add(graph.getEdge(ab));
		q.add(graph.getEdge(bc));
		q.add(graph.getEdge(cd));
		Assert.assertTrue(p.equals(q));
	}
}