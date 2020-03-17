import java.util.Scanner;

public class ArraysMethodsExercise1 {
    public static void Arrange(int [] array1, int[] array2, int biggest, int secbiggest){
        int j = 0;
        //biggest
        for(int i=0;i<array1.length;i++){
            if(array1[i]>biggest){
                biggest = array1[i];
                j = i;
            }
        }
        //second biggest
        for(int i = 0;i<array1.length;i++){
            if(array1[i]<biggest && array1[i]>secbiggest){
                secbiggest = array1[i];
            }
        }
        for(int i = 0;i<j;i++){
            array2[i] = array1[i];
        }
        array2[j] = secbiggest;
        array2[j+1] = biggest-secbiggest;
        for(int i = j+2;i<array2.length;i++){
            array2[i] = array1[i-1];
        }

        for(int i = 0;i<array2.length;i++){
            System.out.print(array2[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] myNumbers = new int[5];
        int i;
        System.out.println("Enter 5 numbers: ");
        for (i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            myNumbers[i] = a;
        }
        int[] b = new int[myNumbers.length + 1];
        int secbiggest = myNumbers[0];
        int biggest = myNumbers[0];

        Arrange(myNumbers, b, biggest, secbiggest);
    }
}

