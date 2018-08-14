package helper;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomIntArray {

    public int [] theArray;

    public RandomIntArray(int size) {
        theArray = new int[size];
        Arrays.parallelSetAll(theArray, i -> ThreadLocalRandom.current().nextInt(0,10));
    }

    public int[] getTheArray() {
        return theArray;
    }

    public void print() {
        for (int i : theArray) {
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
}
