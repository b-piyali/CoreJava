package algo.sorting;

public class SelectionSort {
    public int[] sort(int a[]){
        int len = a.length;
        int min;
        for(int i = 0; i<len; i++){
            min =i;
            for(int j= i+1; j<len; j++){
                if(a[min] > a[j])
                    min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }
}
