package algo.sorting;

public class InsertionSort {

    public int[] sort(int arr[]){
        int len = arr.length;
        int holePosition;
        int valueToInsert;
        for(int i = 1; i < len; i++){
            valueToInsert =arr[i];
            holePosition = i;

            while(holePosition > 0 && arr[holePosition-1] > valueToInsert){
                arr[holePosition]= arr[holePosition-1];
                holePosition = holePosition -1;
            }
            arr[holePosition] = valueToInsert;
        }
        return arr;
    }

}
