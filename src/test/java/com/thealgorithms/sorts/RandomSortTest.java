package com.thealgorithms.sorts;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

public abstract class RandomSortTest {
    
    abstract SortAlgorithm getSortAlgorithm();


    @Test
    void randomSortTesting(){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int nrOfElements = random.nextInt(0,101);
            Integer array [] = new Integer[nrOfElements];
            for (int j = 0; j < array.length; j++) {
                array[j] = random.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
            Integer[] sorted = getSortAlgorithm().sort(array);
            Arrays.sort(array);
            assertArrayEquals(array, sorted);
        }

    }
}
