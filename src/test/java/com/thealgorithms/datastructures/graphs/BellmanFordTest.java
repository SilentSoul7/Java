/*

package com.thealgorithms.datastructures.graphs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BellmanFordTest {
    
    private BellmanFord graph;
    private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        graph = new BellmanFord(5, 6);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /*
     * x Source Vertex
     * y End vertex
     * z Weight
     
    @Test
    void addEdge() {
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 6);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 2);

        BellmanFord.Edge[] edges = graph.getEdgeArray();
        assertEquals(6, edges.length);
        assertEquals(0, edges[0].u = 0);
        assertEquals(0, edges[1].u = 0);
    }

    @Test
    void printPath() {
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 6);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 2);

        BellmanFord.Edge[] edges = graph.getEdgeArray();

        graph.show(0, 4, edges);

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("Distance is: 6.0"));
        

    }

    @Test
    void negativeCycle() {
        graph.addEdge(0, 1, 1);    // Edge from 0 to 1 with weight 1
        graph.addEdge(1, 2, -2);   // Edge from 1 to 2 with weight -2
        graph.addEdge(2, 0, -4);   // Edge from 2 to 0 with weight -4 (this forms the negative cycle)

        graph.addEdge(1, 3, 6);    // Edge from 1 to 3 with weight 6
        graph.addEdge(2, 4, 3);    // Edge from 2 to 4 with weight 3
        graph.addEdge(3, 4, 2);

        BellmanFord.Edge[] edges = graph.getEdgeArray();

        graph.show(0, 4, edges);

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("Negative cycle"));
        

    }

    @Test
    void testGoNegativeCycle() {

        String simulatedInput = "4 4\n0 1 1\n1 2 -2\n2 3 3\n3 1 -4\n";

        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        graph.go();

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("Negative cycle"));
    }

    @Test
    void testGoValidGraph() {

        String simulatedInput = "5 6\n0 1 1\n0 2 3\n1 2 5\n1 3 6\n2 4 3\n3 4 2";

        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        graph.go();

        String output = outputStreamCaptor.toString();
        assertFalse(output.contains("Negative cycle"));
    }

    */

    /*
     * 
     *  graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 6);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 2);
     



}

*/
