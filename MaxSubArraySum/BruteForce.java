public class BruteForce {

    public static void printMaxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i;j<=arr.length-1;j++){
                int currentSum = 0;
                for(int k=i;k<=j;k++){
                    currentSum = currentSum + arr[k];
                    maxSum = (currentSum>maxSum) ? currentSum : maxSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        printMaxSubArraySum(arr);
    }    
}
