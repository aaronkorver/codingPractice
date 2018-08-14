package sorting;

import helper.RandomIntArray;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        RandomIntArray array = new RandomIntArray(510000);

       // array.print();
        long startTime = System.currentTimeMillis();
        int[] sortedArray = sort(array.theArray);
        long fullTime = System.currentTimeMillis() - startTime;
        System.out.println();
        array.theArray = sortedArray;
       // array.print();
        System.out.printf("%nIt took %d nanos", fullTime);
    }

    /**
     * Worst case is O(n log n) .  Recursive so time is height of tree * cost of each level.
     * tree is binary, so height is log n.  Will have cost of n for each level so n * log n
     */
    private static int[] sort(int[] theArray)
    {
        if(theArray.length == 1) return theArray;
        else
        {
            return merge(sort(Arrays.copyOfRange(theArray,0,theArray.length/2)),
                    sort(Arrays.copyOfRange(theArray, (theArray.length/2), theArray.length)));
        }
    }

    private static int[] merge(int[] left, int[] right)
    {
        int i = 0 ,j = 0, k = 0;
        int[] finalArray = new int[left.length + right.length];
        while (i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                finalArray[k++] = left[i++];
            }
            else
            {
                finalArray[k++] = right[j++];
            }
        }
        while (i < left.length)
        {
            finalArray[k++] = left[i++];
        }
        while (j < right.length){
            finalArray[k++] = right[j++];
        }

        return finalArray;

    }
}
