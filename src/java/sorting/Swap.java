package sorting;

public class Swap {

    static void swap(int [] array, int pos1, int pos2, boolean print)
    {
        int x = array[pos1];
        array[pos1] =  array[pos2];
        array[pos2] = x;
        if(print)
        {
            System.out.printf("Swapping values %d and %d %n", array[pos2], array[pos1]) ;
        }
    }
    static void swap(int [] array, int pos1, int pos2)
    {
        swap(array,pos1,pos2,false);
    }
}
