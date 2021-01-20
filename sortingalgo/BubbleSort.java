package sortingalgo;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,8,1};
        int n = arr.length;
        int temp;
       boolean swapped=false;
        for(int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped=true;
                }

            }
if(swapped==false){
    break;
}
        }

        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
    }

}
