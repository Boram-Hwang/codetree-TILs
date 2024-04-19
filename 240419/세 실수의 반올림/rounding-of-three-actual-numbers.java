import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        System.out.println(Math.round(a * 1000)/1000.0);
        System.out.println(Math.round(b * 1000)/1000.0);
        System.out.printf("%.3f",c);
    }
}