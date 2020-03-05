public class ArrayExercise4 {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3, 4, 5, 7};
        int sum = 0;
        int prod = 1;
        int i;
        for (i = 0; i < myNumbers.length; i++) {
            sum += myNumbers[i];
            prod *= myNumbers[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
    }
}
