import java.util.Scanner;
public class Main{

    public static boolean isPrime(int number){
        boolean isPrime=false;
        if(number==2){
            isPrime = true;
        }
        else{
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime = false;
                    break;
                }
                else{
                    isPrime = true;
                }
        }

        }
        return isPrime;
        
    }
    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);
        System.out.print("Enter the number upto which prime numebrs to be printed : ");
        int number = inputSc.nextInt();
  
        for(int i=2;i<=number;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
            else if(isPrime(i)==false){
                continue;
            }
        }
        inputSc.close();
    }
}