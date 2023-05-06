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


public class CodexTest_0_3_29 { 
  @Test
    public void testEquals() {
        Path path1 = new Path();
        Path path2 = new Path();
        path1.add(new Edge("ab", new Node("a"), new Node("b")));
        path1.add(new Edge("bc", new Node("b"), new Node("c")));
        path1.add(new Edge("cd", new Node("c"), new Node("d")));
        path2.add(new Edge("ab", new Node("a"), new Node("b")));
        path2.add(new Edge("bc", new Node("b"), new Node("c")));
        path2.add(new Edge("cd", new Node("c"), new Node("d")));
        assertTrue(path1.equals(path2));
    }
}