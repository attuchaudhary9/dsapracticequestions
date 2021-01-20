package Searching;


public class BinaryLinearSearch {
  static int bSearch(int arr[],int size,int element){
    int low,high,mid;
    low =0;
    high=size-1;
    mid=(high+low)/2;
    while(low<=high){
        if(arr[mid]==element){
            return mid;
        }
        if(arr[mid]<element){
            low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,11,22,33,55};

        int size = arr.length;
        int element = 1;
       int result = bSearch(arr,size,element);
        if(result==1){

    }
}}


