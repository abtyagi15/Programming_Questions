public class Main{

    public static void sortArrayByBubble(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                
                if(arr[j]<=arr[j+1]){
                    continue;    
                }
                else{
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }        
        }
        System.out.print("Sorted Array : ");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        sortArrayByBubble(arr);
    }
}