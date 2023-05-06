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


public class CodexTest_0_3_6 { 
    @Test
	public void testContains() {
		Path path = new Path();
		path.add(new Edge(1, 2));
		path.add(new Edge(2, 3));
		path.add(new Edge(3, 4));
		path.add(new Edge(4, 5));
		assertTrue(path.contains(new Edge(2, 3)));
		assertFalse(path.contains(new Edge(3, 2)));
	}
}