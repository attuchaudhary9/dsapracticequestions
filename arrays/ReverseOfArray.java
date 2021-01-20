package arrays;

public class ReverseOfArray {
    public static void reverseArray(int[] arr,int n){
        int start =0;
        int end = n-1;
        int temp;
        while(start<=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
    int[] arrayOne={1,5,6,8,12,45,78,3};
    reverseArray(arrayOne,arrayOne.length);
    printArray(arrayOne, arrayOne.length);
    }
}
