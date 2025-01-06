package com.thealgorithms;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import com.thealgorithms.datastructures.trees.RedBlackBST;

public class RedBlackTreeTest {
    
    private RedBlackBST RBtree;
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Test
    void testRedBlackInsert() {

        

        String simulatedInput = "6\n7\n22\n14\n4\n-999";
        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        System.setOut(new PrintStream(outputStream));
        
        RBtree = new RedBlackBST();
        RBtree.insertDemo();

        String output = outputStream.toString();
        assertTrue(output.contains("Pre order"));

        simulatedInput = "6\n-999";
        inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));
        RBtree.deleteDemo();

        output = outputStream.toString();
        assertTrue(output.contains("deleted!"));

        simulatedInput = "4\n-999";
        inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));
        RBtree.deleteDemo();

        output = outputStream.toString();
        assertTrue(output.contains("deleted!"));

    }
}
