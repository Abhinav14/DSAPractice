package array;

public class MaxDiffOptimized {
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 8, 5, 1};
        int sum=0, minDiff = arr[0], n = arr.length, a = 0, b = 0;
        for(int i = 1; i < n; i++){
            a = minDiff;
            b = arr[i];
            if(b > a){
                if(b-a > sum){
                    sum = b-a;
                }
            }
            if(arr[i] < minDiff){
                minDiff = arr[i];
            }
        }
        System.out.println("Max difference is : "+sum);
    }
}
