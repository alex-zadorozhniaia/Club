import java.util.Scanner;
public class Money {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int number = scan.nextInt();
        if (number == 0 || (number >= 5 && number <= 10)) {
            System.out.println(number + " гривень");
        } else if (number >= 2 && number <= 4) {
            System.out.println(number + " гривні");
        } else if (number == 1) {
            System.out.println(number + " гривня");
        }
    }
}
