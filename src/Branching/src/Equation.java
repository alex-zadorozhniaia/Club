import java.util.Scanner;

public class Equation {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ВВедіть значення а, b, c для: ax^2+bx+c=0");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double D = b*b - 4*a*c;

        if(D>0){
            double d = Math.sqrt(D);
            double x1 = ((-b - d) / 2 * a);
            double x2 = ((-b + d) / 2 * a);
            System.out.println("Рівняння має два корені x1: " + x1 +" та x2: "+ x2);
        } else if (D == 0) {
            double d = Math.sqrt(D);
            double x = (-b / 2 * a);
            System.out.println("Рівняння має один корень x: " + x);
        }else{
            System.out.println("Рівняння немає коренів D<0");
        }

    }
}
