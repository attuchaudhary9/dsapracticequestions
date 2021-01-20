package sortingalgo;

public class BubbleSortRevision {
    static void getSortedAarry(int[] arr,int n){
        int temp,i,j;
        boolean swapped=false;
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    static void getArray(int[] arr,int n){
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,47,13,5,4,2,3,4,5,2};
        int n=arr.length-1;
        getSortedAarry(arr,n);
        getArray(arr,n);

    }
}
