import java.util.Scanner;

public class Task1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num = scan.nextInt();
        int sum =0;
        for(int i = 1; i <= num; i++){
            int oddness = 2 * i - 1;
                System.out.println(oddness);
                sum += oddness;
            }
        System.out.println("Sum:" + sum);
    }
}