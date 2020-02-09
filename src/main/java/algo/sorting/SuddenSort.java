package algo.sorting;

public class SuddenSort {

    public int[] sort(int a[]){
        int len = a.length;
        for(int i = 0; i < len-1; i++){
            for(int j = i+1; j< len; j++){
                if(a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }
}
