package algo.sorting;

public class QuickSort {

    private int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int lowIndex = low;
        for (int j=low; j<=high-1; j++){
            if (arr[j] <= pivot){

                int temp = arr[lowIndex];
                arr[lowIndex] = arr[j];
                arr[j] = temp;
                lowIndex++;
            }
        }

        int temp = arr[lowIndex];
        arr[lowIndex] = arr[high];
        arr[high] = temp;

        return lowIndex;
    }

    public void qSort(int arr[], int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            qSort(arr, low, pi-1);
            qSort(arr, pi+1, high);
        }
    }
}
