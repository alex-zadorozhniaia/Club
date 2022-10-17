import java.lang.reflect.Array;

public class Task2 {
    public static void main(String[] args) {
        int[] values = {1, 0, 2, 5, 6, 4, 10, 3};
        int i =0;
        while ( i != values.length - 1){
            int index = values[i];
            values[i]=values[values.length - 1];
            values[values.length - 1] = index;
            i++;

        }
        for(i = 0; i< values.length; i++) {
            System.out.println(values[i]  + " ");
        }

    }
}
