package algorithms.mergesort;

public class App {

    public static void main(String[] args) {
        int[] inputArray = {9,7,3,1,6,3,2,6,8,9,2,3,0};

        sort(inputArray, 0, inputArray.length-1);

        for(int i : inputArray){
            System.out.print(i + ", ");
        }
    }

    public static void sort(int a[], int start, int end){
        if(end <= start){
            return;
        }
        int mid = Math.round((start+end)/2);
        sort(a, start, mid);
        sort(a, mid+1,end);
        merge(a, start, mid, end);
    }

//    public static void merge(int[] a, int start, int mid, int end){
//        int[] left = new int[mid-start];
//        int[] right = new int[end-(mid+1)];
//
//        for(int i=0;i<=mid;i++){
//            left[i] = a[i];
//        }
//
//        for(int i=mid+1;i<=end;i++){
//            right[i] = a[i];
//        }
//        int ri = 0;
//        int le = 0;
//        for(int i =0; i<end;i++){
//            if(left[le] < right[ri]){
//                a[i] = left[le];
//                le++;
//            } else {
//                a[i] = right[ri];
//                ri++;
//            }
//        }
//    }

    public static void merge(int a[], int start, int mid, int end){
        int tempArray[] = new int[end - start+1];

        int leftSlot = start;
        int rightSlot = mid+1;
        int k =0;

        while(leftSlot <= mid && rightSlot <= end){
            if(a[leftSlot] < a[rightSlot]){
                tempArray[k] = a[leftSlot];
                leftSlot++;
            } else {
                tempArray[k] = a[rightSlot];
                rightSlot++;
            }
            k++;
        }

        if(leftSlot <= mid){
            while(leftSlot <= mid) {
                tempArray[k] = a[leftSlot];
                leftSlot++;
                k++;
            }
        } else if(rightSlot <= end){
            while(rightSlot <= end) {
                tempArray[k] = a[rightSlot];
                rightSlot++;
                k++;
            }
        }

        for(int i =0; i< tempArray.length; i++){
            a[start+1] = tempArray[i];
        }
    }
}


