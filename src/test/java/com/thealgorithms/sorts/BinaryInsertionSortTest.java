package com.thealgorithms.sorts;

class BinaryInsertionSortTest extends RandomSortTest {
    private final BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();

    @Override
    SortAlgorithm getSortAlgorithm() {
        return binaryInsertionSort;
    }
}
