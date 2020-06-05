import java.util.Arrays;
public class Main
{
    
    public static void main(String[] args)
    {
        int[] testArr1 = new int[50];
        int[] testArr2 = new int[50];
        int[] testArr3 = new int[50];
        randArray(testArr1, 50);
        randArray(testArr2, 50);
        randArray(testArr3, 50);
        
        System.out.println("Unsorted: ");
        printArr(testArr1);
        SelectionSort.sort(testArr1);
        System.out.println("Merge sort: ");
        printArr(testArr1);
        System.out.println();
        
        System.out.println("Unsorted: ");
        printArr(testArr2);
        InsertionSort.sort(testArr2);
        System.out.println("Insertion sort: ");
        printArr(testArr2);
        System.out.println();
        
        System.out.println("Unsorted: ");
        printArr(testArr3);
        System.out.println("Merge sort: ");
        MergeSort.mergeSort(testArr3, 50);
        printArr(testArr3);
        System.out.println();
        
    }
    public static void printArr(int[] arr){
        System.out.println( Arrays.toString(arr) );
       
    }
    public static void randArray(int[] array ,int length){
        for(int i = 0 ; i < length ; i++){
            array[i] =(int)(Math.random() * 100 );
        }
    }
    
}
