package algorithms.linearsearch;

public class App {

    public static int linearSearch(int[] a, int x){
        for(int i = 0; i<a.length;i++){
            if(a[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int x){
        int p = 0;
        int r = a.length-1;
        int q= 0;
        while(p<=r){
            q = Math.round((p+r)/2);
            if(a[q] == x){
                return q;
            } else if(a[q] > x){
                r = --q;
            } else {
                p = ++q;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(linearSearch(new int[]{1,2,3,4,5}, 6));
        System.out.println(binarySearch(new int[]{1,2,3,4,5}, 3));
    }
}
