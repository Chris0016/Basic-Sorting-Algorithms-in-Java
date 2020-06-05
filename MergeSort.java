public class MergeSort{
    
    public static void merge(int[] current, int[] left , int[] right){
        
        int i1 = 0, i2 =0 , k =0 ;
        
        int leftSize = left.length;
        int rightSize = right.length;
        
        while( rightSize > 0 &&  leftSize> 0)  {
            //Compare both for smallest
            if(left[i1] <= right[i2]){
                current[k++] = left[i1++];
                leftSize--;
            }
            else{
                current[k++] = right[i2++];
                rightSize--;
            }
        }
        //If there is any element still left on either list then add them to the final list
        while( leftSize > 0){
            current[k++] = left[i1++];
            leftSize--;
        }
        while( rightSize > 0){
            current[k++] = right[i2++];
            rightSize--;
        }
        
    }
    public static void mergeSort( int[] array, int length ){
        if(length < 2) return;
        int mid = length /2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        
        for(int i = 0 ; i < mid; i++){
            left[i] = array[i];
        }
        for(int i = mid ; i < length ; i++){
            right[i-mid] = array[i];
            
        }
            
        
        mergeSort(left, mid);
        mergeSort(right, length - mid);
        
        merge(array, left , right);
    }
   

}
