public class ArrayExercise7 {
    public static void main(String[] args) {
        String [] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String [] a = new String[arr.length/2];
        String [] b = new String[arr.length/2];
        int i;
        for (i=0; i<arr.length/2; i++) {
            a[i] = arr[i];
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        for (i=arr.length/2; i<arr.length; i++) {
            b[i-arr.length/2] = arr[i];
            System.out.print(b[i-arr.length/2] + " ");
        }

    }
}
