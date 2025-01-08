package com.thealgorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
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
    void testRedBlackInsertAndDelete() {

        

        String simulatedInput = "6\n7\n22\n14\n4\n-999";
        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        System.setOut(new PrintStream(outputStream));
        
        RBtree = new RedBlackBST();
        RBtree.insertDemo();

        String output = outputStream.toString();
        assertTrue(output.contains("Pre order")); // Done inserting
        assertTrue(output.contains(" B Key: 7 Parent: -1")); //root, -1 is the parent of root
        assertTrue(output.contains(" B Key: 6 Parent: 7"));
        assertTrue(output.contains(" R Key: 4 Parent: 6"));
        assertTrue(output.contains(" B Key: 22 Parent: 7"));
        assertTrue(output.contains(" R Key: 14 Parent: 22"));

        outputStream.reset();

        simulatedInput = "6\n-999";
        inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));
        RBtree.deleteDemo();

        output = outputStream.toString();
        assertTrue(output.contains("deleted!"));

        assertTrue(output.contains(" B Key: 7 Parent: -1"));
        assertTrue(output.contains(" B Key: 22 Parent: 7"));
        assertTrue(output.contains(" B Key: 4 Parent: 6"));
        assertTrue(output.contains(" R Key: 14 Parent: 22"));

        assertFalse(output.contains(" B Key: 6 Parent: 7"));

        outputStream.reset();

        simulatedInput = "4\n-999";
        inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));
        RBtree.deleteDemo();

        output = outputStream.toString();
        assertTrue(output.contains("deleted!"));
        assertTrue(output.contains(" B Key: 14 Parent: -1"));
        assertTrue(output.contains(" R Key: 7 Parent: 14"));
        assertTrue(output.contains(" R Key: 22 Parent: 14"));

        assertFalse(output.contains(" B Key: 6 Parent: 7"));
        assertFalse(output.contains(" R Key: 4 Parent: 6"));
        

    }
}
