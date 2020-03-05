import java.util.Scanner;

public class ArrayExercise2 {
    public static void main(String[] args) {
        int i;
        String[] myNumbers = new String[10];
        System.out.println("Enter 10 numbers: ");
        for (i = 0; i < 10; i++) {
            Scanner in = new Scanner(System.in);
            String a = in.nextLine();
            myNumbers[i] = a;
        }
        System.out.println("Enter a number to check: ");
        Scanner in = new Scanner(System.in);
        String b = in.nextLine();
        int found = 0;
        for (i = 0; i < 10; i++) {
            //    if (myNumbers[i] == b) {
            //        System.out.println("Your number is present in the array!");
            //    }

            if (myNumbers[i].contains(b)) {
                found = 1;
            }
        }

        if (found == 1) {
            System.out.println("Your number is present in the array!");
        }
        else {
            System.out.println("Your number is not present in the array!");
        }
    }
}
