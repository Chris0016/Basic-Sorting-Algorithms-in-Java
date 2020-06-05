public class InsertionSort
{
     static int current;
    public static void sort(int[] array){
        int k;
        for (int i = 1; i < array.length ; i++){
            current = array[i];
            k = i-1;
            while(k >= 0 &&current < array[k]){
                array[k +1] = array[k];
                k--;
            }
            array[k+1] = current;
        }
    }
}
