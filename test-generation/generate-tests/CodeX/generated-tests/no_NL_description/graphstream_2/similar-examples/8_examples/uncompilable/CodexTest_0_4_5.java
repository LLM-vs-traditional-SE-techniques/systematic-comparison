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


public class CodexTest_0_4_5 { 
    @Test
    public void testEquals() {
        assertTrue(path.equals(path));
        assertFalse(path.equals(null));
        assertFalse(path.equals(new Object()));
        assertFalse(path.equals(new Path()));
        path.add(edge);
        assertFalse(path.equals(new Path()));
    }
}