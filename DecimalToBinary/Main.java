import java.util.Scanner;

public class Main {
    public static int convertorDecimalToBinary(int decimal){
        
        int binary = 0;
        int power = 0;
        while(decimal>0){
            binary = binary + (decimal%2)*((int)Math.pow(10,power));
            decimal = decimal/2;
            power++;
        }

        return binary;
    }

    public static void printBinary(int decimal){
        System.out.println(convertorDecimalToBinary(decimal));
    }
    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);
        System.out.print("Enter the decimal : ");
        int decimal = inputSc.nextInt();
        printBinary(decimal);
        inputSc.close();
    }
}
