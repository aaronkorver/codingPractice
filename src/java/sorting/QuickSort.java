package sorting;

import helper.RandomIntArray;

public class QuickSort {

    public static void main(String[] args) {
        RandomIntArray array = new RandomIntArray(10);
        array.print();
        quickSort(array.theArray, 0, array.theArray.length-1);
        array.print();
    }

    private static void quickSort(int[] theArray, int low, int high) {
        if (low < high) {
            int pivotValue = theArray[high];
            int positionOfLeftMostValueHigherThanPivot = low;
            for (int i = low; i < high; i++) {
                if (theArray[i] <= pivotValue) {
                    Swap.swap(theArray, positionOfLeftMostValueHigherThanPivot++, i, true);
                }
            }
            Swap.swap(theArray, positionOfLeftMostValueHigherThanPivot, high, true);
            quickSort(theArray, low, positionOfLeftMostValueHigherThanPivot - 1);
            quickSort(theArray, positionOfLeftMostValueHigherThanPivot + 1  , high);
        }
    }
}
