import java.util.Currency;

public class OptimalApproach {

    public static void printMaxSubArraySum(int arr[]){


        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+ arr[i];
        }
    
        int maxSum = prefix[0];
        int currentSum = prefix[0];

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<prefix.length;j++){
                int end =j;                
                currentSum=(start==0)? prefix[end] :prefix[end]-prefix[start-1];

                maxSum = (currentSum>maxSum) ? currentSum : maxSum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        printMaxSubArraySum(arr);
    }    
}
