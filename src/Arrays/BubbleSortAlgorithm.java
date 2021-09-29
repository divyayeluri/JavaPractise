package Arrays;
public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {20};
        //as last one will be sorted ,we use lastindex
       for(int lastIndex  = arr.length - 1;lastIndex> 0 ;lastIndex--) {
           //iterate through minus lastindex each time
           for(int i = 0;i<lastIndex;i++){
               if(arr[i] > arr[i+1]){
                   swap(arr,i,i+1);
               }
           }
       }
        for(int i = 0 ;i<arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
    public static void swap(int[] array,int i,int j){
        if(i == j) {
            return;
        }
         int  temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
