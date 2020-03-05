public class ArrayExercise5 {
    public static void main(String[] args) {
        int myNumbers[] = new int[]{12, 88, 54, 21, 70, 62, 22, 9};
        int smallest = myNumbers[0];
        int biggest = myNumbers[0];

        for(int i=1; i< myNumbers.length; i++)
        {
            if(myNumbers[i] > biggest)
                biggest = myNumbers[i];
            else if (myNumbers[i] < smallest)
                smallest = myNumbers[i];

        }

        System.out.println("Largest Number is : " + biggest);
        System.out.println("Smallest Number is : " + smallest);
    }
}
