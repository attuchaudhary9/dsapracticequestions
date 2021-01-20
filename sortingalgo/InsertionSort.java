package sortingalgo;

public class InsertionSort {
    static void sort(int arr[],int n){
        for(int i=1;i<n;++i){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>=key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    static void printl(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,5,6,7,6,3,4};
        int n = arr.length;
        sort(arr,n);
        printl(arr,n);

    }
}
