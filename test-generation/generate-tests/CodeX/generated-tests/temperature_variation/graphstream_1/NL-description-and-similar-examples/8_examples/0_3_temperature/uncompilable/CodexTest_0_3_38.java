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


public class CodexTest_0_3_38 { 
    @Test
    public void testContains() {
        Path path = new Path();
        path.add(new Edge("a", "b"));
        path.add(new Edge("b", "c"));
        path.add(new Edge("c", "d"));
}