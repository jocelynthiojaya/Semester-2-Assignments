public class ArrayExercise6 {
    public static void main(String[] args) {
        int[] a = {2, 3, 15, 7, 15, 3, 2};
        boolean read = true;
        int j = a.length - 1;

        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[j]) {
                read = false;
                break;
            } else
                j--;
        }
        if (read == true){
            System.out.println("It is the same");
        }
        else {
            System.out.println("It is not the same");
        }
    }
}
