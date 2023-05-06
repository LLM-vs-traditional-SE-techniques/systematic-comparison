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


public class CodexTest_0_9_47 { 
  @Test
	public void contains_RightEdgeGiven() {
		Path path = new Path().extend(edge1, 2).extend(edge2, 2).extend(edge3, 2);
		assertTrue(path.contains(edge1));
	}
}