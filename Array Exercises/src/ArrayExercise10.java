public class ArrayExercise10 {
    public static void main(String[] args) {
        int i, j, temp;
        int arr[] = {16, 2, 4, 120, 30};

        int n = 5;
        for (i=0; i<(n-1); i++){
            for (j=0; j<(n-1-i); j++){
                if (arr[j] > arr[j+1]){
                    // if (arr[j] < arr[j+1]) for descending
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Ascending: ");
        for (i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
