package algo.sorting;

public class MergeSort {

    private void merge(int leftArr[], int rightArr[], int mainArr[]){
        int leftLen = leftArr.length;
        int rightLen = rightArr.length;
        int leftPos =0;
        int rightPos =0;
        int mergePos =0;

        while(leftPos < leftLen && rightPos < rightLen){
            if(leftArr[leftPos] < rightArr[rightPos]){
                mainArr[mergePos] = leftArr[leftPos];
                leftPos++;
            }else{
                mainArr[mergePos] = rightArr[rightPos];
                rightPos++;
            }
            mergePos++;
        }
        while(leftPos < leftLen){
            mainArr[mergePos] = leftArr[leftPos];
            leftPos++;
            mergePos++;
        }
        while(rightPos < rightLen){
            mainArr[mergePos] = rightArr[rightPos];
            rightPos++;
            mergePos++;
        }
    }

    public void mSort(int arr[]){
        int arrLen = arr.length;
        if (arrLen < 2)
            return;
        int mid = arrLen/2;
        int leftLen = mid;
        int rightLen = arrLen - mid;
        int leftArr[] = new int[leftLen];
        int rightArr[] = new int[rightLen];
        for(int i=0; i<mid; i++){
            leftArr[i] = arr[i];
        }
        for (int i=mid; i<arrLen; i++){
            rightArr[i-mid] = arr[i];
        }
        mSort(leftArr);
        mSort(rightArr);
        merge(leftArr, rightArr, arr);
    }
}
