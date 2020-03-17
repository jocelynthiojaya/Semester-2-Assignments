import java.util.Scanner;

public class ArraysMethodsExercise2 {
    public static int[] Shift(int [] array){
        int num = array[4];
        for(int j = 4; j>0; j--)
        {
            array[j]=array[j-1];
        }
        array[0]=num;
        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myNumbers = new int[5];
        int i;
        System.out.println("INPUT: ");
        for (i = 0; i < 5; i++) {
            int x = in.nextInt();
            myNumbers[i] = x;
        }

        System.out.println("ROTATION: ");
        int rot = in.nextInt();
        for (i = 0; i < rot; i++) {
            myNumbers = Shift(myNumbers);
        }

        for(int j = 0; j<=4; j++)
        {
            System.out.print(myNumbers[j] + " ");
        }

    }
}
