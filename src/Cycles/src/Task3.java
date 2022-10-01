import java.util.Scanner;

public class Task3 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num = scan.nextInt();
        boolean res = false;
        for (int i = 2; i<=num / 2 ; i++){
            if( num % i ==0 ){
                res= true;
                break;
            }
        } if (!res){
            System.out.println("Просте");
        }else {
            System.out.println("Не просте");
        }
    }
}
