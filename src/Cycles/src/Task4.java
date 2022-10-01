public class Task4 {
    public static void main(String[] args) {
    int fib = 20;
    int num1 = 0;
    int num2 = 1;
    int res;
    double sum = 1;

    for(int i = 2; i<=fib; ++i){
        res = num1 + num2;
        num1 = num2;
        num2 = res;
        sum +=num2 ;
        System.out.println(num2);

        }
        System.out.println(sum/20);

    }
}
