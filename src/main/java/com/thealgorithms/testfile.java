package com.thealgorithms;

import com.thealgorithms.sorts.*;

public class testfile {

    public static void main(String[] args) {
        
        Integer[] array = {34, 7, 23, 32, 5, 62};
        SortAlgorithm a = new QuickSort();
        Integer[] sorted = a.sort(array);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
        

    }
}
