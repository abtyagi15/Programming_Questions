public class Main {

    public static int binarySearch(int binArr[], int key){
        int low = 0;
        int high = binArr.length-1;
        int mid =0;
        

        while(low<=high){
            mid = (low+high)/2;
            if(binArr[mid]==key){
                break;
            }
            else if(key>binArr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int binArr [] = {-10,-9,-3,-1,4,6,8,10};
        int key = -3;

        System.out.println("The key is : " + binarySearch(binArr,key));
    }
}
