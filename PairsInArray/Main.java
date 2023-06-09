public class Main {
    public static void printPairs(int arrs[]){
        for(int i=0;i<arrs.length;i++){
            int current = arrs[i];
            for(int j=i+1;j<arrs.length;j++){
                System.out.print("("+current+","+arrs[j]+")");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,8,6,7,9};
        printPairs(arr);
    }
}
