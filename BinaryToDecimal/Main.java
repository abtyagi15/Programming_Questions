import java.util.Scanner;

public class Main {

    public static int convertorBinaryToDecimal(String binaryNumberString){
        char[] binaryCharacter = binaryNumberString.toCharArray();

        int sum=0;
        for(int index=0;index<binaryCharacter.length;index++){
            char individualCharcter = binaryCharacter[binaryCharacter.length - 1 - index];
            int binaryValue = Character.getNumericValue(individualCharcter);
            
            sum = sum + binaryValue*((int)Math.pow(2,index));
        }    
        return sum;
        
    }
    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        String binaryNumberString = inputSc.nextLine();
        System.out.println(convertorBinaryToDecimal(binaryNumberString));

        inputSc.close();
    }
}
