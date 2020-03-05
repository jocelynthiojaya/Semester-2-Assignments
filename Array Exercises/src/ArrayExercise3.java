import java.util.Scanner;

public class ArrayExercise3 {
    public static void main(String args[]) {
        int i;
        int[] myNumbers = new int[20];
        System.out.println("Enter 20 numbers: ");
        int pos = 0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for (i = 0; i < 20; i++) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            myNumbers[i] = a;
        }
        for (i = 0; i < 20; i++) {
            if(myNumbers[i]>0){
                pos++;
            }
            else if(myNumbers[i]<0){
                neg++;
            }
            else{
                zero++;
            }
            if(myNumbers[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Positive : "+pos+"\nNegative : "+neg+"\nZero : "+zero+"\nOdd : "+odd+"\nEven : "+even);
    }
}
