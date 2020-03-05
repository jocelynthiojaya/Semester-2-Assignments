public class ArrayExercise8 {
    public static void main(String[] args) {
        int myNumbers[] = new int[]{4, 8, 6, 3, 2};
        int[] b = new int[myNumbers.length+1];
        int secbiggest = myNumbers[0];
        int biggest = myNumbers[0];
        int j = 0;

        for(int i=0;i<myNumbers.length;i++){
            if(myNumbers[i]>biggest){
                biggest = myNumbers[i];
                j = i;
            }
        }
        //second biggest
        for(int i = 0;i<myNumbers.length;i++){
            if(myNumbers[i]<biggest && myNumbers[i]>secbiggest){
                secbiggest = myNumbers[i];
            }
        }

        //System.out.println(biggest);
        //System.out.println(secbiggest);

        for(int i = 0;i<j;i++){
            b[i] = myNumbers[i];
        }
        b[j] = secbiggest;
        b[j+1] = biggest-secbiggest;
        for(int i = j+2;i<b.length;i++){
            b[i] = myNumbers[i-1];
        }
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
