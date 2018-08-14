package sorting;

import helper.RandomIntArray;

public class InsertionSort {

    public static void main(String[] args) {
        RandomIntArray array = new RandomIntArray(50);

        array.print();
        sort(array.theArray);
        System.out.println();
        array.print();
    }
/**
 * Runs worse case O(n^2) time.  Has O(1) size as is in place swap.
 * outer loop is O(n), inner loop is SUM(N-1, N-2, N-3, ..., 1) = N.  So N*N
 */
    public static void sort(int[] items)
    {
        for(int i = 1; i < items.length; i++)
        {
            for(int j = i; j > 0 && items[j] < items[j - 1]; j--)
            {
                Swap.swap(items, j, j - 1);
            }
        }
    }
}
