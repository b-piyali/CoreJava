package algo.sorting;

public class BubbleSort {
    public int[] sort(int a[]){
        int len = a.length;
        boolean flag;
        for(int i = 0; i < len-1; i++){
            flag = false;
            int max = len - i - 1 ;
            for(int j = 0; j< max; j++){
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)
                break;
        }
        return a;
    }

}
