package array;

public class MaxDiffBF {
    public static void main(String[] args) {
        int ans = 0, n = 0;
        int[] arr = {2, 7, 5, 3, 8};
        n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[j] > arr[i]){
                    if(arr[j] - arr[i] > ans){
                        ans = arr[j] - arr[i];
                    }
                }
            }
        }
        System.out.println("Max difference is : "+ans);
    }

}
