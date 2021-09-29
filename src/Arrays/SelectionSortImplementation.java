package Arrays;
public class SelectionSortImplementation {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        for(int lastunsortedIndex = arr.length-1;lastunsortedIndex>0;lastunsortedIndex--){
            int largest = 0;
            //iterate through i =1 to lastunsortedindex and fix largest = 0th index for now
            for(int i = 1;i<=lastunsortedIndex;i++){
                if(arr[i]>arr[largest]){
                    //if largest found then assign i to largest
                    largest = i; }
            }
            //swap largest index with lastundertedindex
            swap(arr,largest,lastunsortedIndex);
        }
     for(int i = 0 ;i<arr.length ;i++){
        System.out.println(arr[i]); }
}
    public static void swap(int[] array,int i,int j){
        if(i == j) {
            return; }
        int  temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
