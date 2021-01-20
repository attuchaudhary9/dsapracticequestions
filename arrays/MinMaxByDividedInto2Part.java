package arrays;

public class MinMaxByDividedInto2Part {
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int arr[],int n){
        
        Pair minmax = new Pair();
        int i;
        if (n==1){
            minmax.min=arr[0];
            minmax.max=arr[0];
            return minmax;
        }
        if(arr[0]<arr[1]){
            minmax.min=arr[0];
            minmax.max=arr[1];
        }else{
            minmax.min=arr[1];
            minmax.max=arr[0];
        }
        for(i=2;i<n;i++){
            if(arr[i]< minmax.min){
                minmax.min=arr[i];
            }else if(arr[i]> minmax.max){
                minmax.max=arr[i];
            }
        }
        return minmax;
    }
    public static void main(String[] args) {
        int arr[]= {1,3,5,7,8,9,3,1122,445,555};
        int n = arr.length;
        Pair minmax = getMinMax(arr,n);
        System.out.println("Maximum is "+minmax.max);
        System.out.println("Minimum is "+minmax.min);
}}
