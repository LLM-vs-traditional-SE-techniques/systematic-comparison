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


public class CodexTest_0_5_6 { 
  @Test
    public void testEquals() {
        Path p1 = new Path();
        p1.setRoot(new Node(a));
        p1.add(new Node(b));
        p1.add(new Node(c));
        Path p2 = new Path();
        p2.setRoot(new Node(a));
        p2.add(new Node(b));
        p2.add(new Node(c));
        assertEquals(p1, p2);
    }
}