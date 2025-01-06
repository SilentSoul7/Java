package com.thealgorithms.sorts;

/**
 * @author Akshay Dubey (https://github.com/itsAkshayDubey)
 * @see QuickSort
 */
class QuickSortTest extends RandomSortTest {
    @Override
    SortAlgorithm getSortAlgorithm() {
        return new QuickSort();
    }
}
