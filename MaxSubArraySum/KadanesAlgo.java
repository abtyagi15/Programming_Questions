import java.util.spi.CurrencyNameProvider;

public class KadanesAlgo {

    public static void printMaxSubArraySum(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
        currentSum =  currentSum<0 ? 0 : currentSum + arr[i];
        maxSum = currentSum>maxSum ? currentSum : maxSum;
       }
       System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        printMaxSubArraySum(arr);
    }
}
