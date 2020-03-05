import java.util.Scanner;
public class ArrayExercise1 {
    public static void main(String args[]) {
            int i;
            int[] myNumbers = new int[10];
            System.out.println("Enter 10 numbers: ");
            for (i = 0; i < 10; i++) {
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                //System.out.println("You entered integer "+a);
                myNumbers[i] = a;
            }
        for (i = 0; i < 10; i++) {
            System.out.print(myNumbers[i] + " ");
        }
    }
}