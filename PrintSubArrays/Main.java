import java.util.Scanner;   
public class Main {

    public static void printSubArrays(int arrs[]){

        for(int i=0;i<arrs.length;i++){
            for(int j=i;j<arrs.length;j++){
                System.out.print("[ ");
                for(int k=i;k<=j;k++){
                    System.out.print(arrs[k]+" ");
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubArrays(arr);
    }
}
