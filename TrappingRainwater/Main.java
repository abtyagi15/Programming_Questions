import java.util.Scanner;
public class Main {
    public static void totalTrappedWater(int height[]){
        int numberOfBars = height.length;

        //left max bouondary
        int leftMaxBound[] = new int[numberOfBars];
        leftMaxBound[0] = height[0];
        for(int index=1;index<numberOfBars;index++){
            leftMaxBound[index] = Math.max(leftMaxBound[index-1],height[index]);
        }

        //right max boundary
        int rightMaxBound[] = new int[numberOfBars];
        rightMaxBound[numberOfBars-1] = height[numberOfBars-1];
        for(int index=numberOfBars-2;index>=0;index--){
            rightMaxBound[index] = Math.max(rightMaxBound[index+1],height[index]);
        }

        //loop for trapped water
        int volume =0;
        for(int index=0;index<numberOfBars;index++){
            int waterLevel = Math.min(leftMaxBound[index],rightMaxBound[index]);
            int trapWater = waterLevel - height[index];
            trapWater = (trapWater<0) ? 0 : trapWater;
            volume = volume+trapWater;       
        }
        System.out.println("Total trapped water is : "+ volume);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bars : ");
        int numberOfBars = sc.nextInt();
        int height[] = new int[numberOfBars];
        System.out.print("Enter the height of bars : ");
        for(int index=0;index<numberOfBars;index++){
            height[index] = sc.nextInt();
        }
        sc.close();
        totalTrappedWater(height);
    }
}
