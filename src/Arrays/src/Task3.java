public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 7};
        int[] array3 = new int[array1.length + array2.length];
        int index = 0;
        int i = 0, j =0;

        while (i < array1.length && j < array2.length)
        {
            array3[index++] = array1[i++];
            array3[index++] = array2[j++];
        }
        while (i < array1.length){
           array3[index++] = array1[i++];
        }
        while (j < array2.length) {
            array3[index++] = array1[j++];
        }


        for (int k = 0; k < array3.length; k++){
            System.out.println(array3[k] + " ");

        }

    }
}
