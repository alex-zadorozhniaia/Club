public class Task2 {
    public static void main(String[] args) {
        int start = 10;
        int finish = 50;
        int num = 3;
        for (int i = start; i<=finish; i++){
            if( i % num == 0){
                System.out.println(i);
            }
        }
    }
}
