import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        double result = (double)a/b;
        String formattedResult = String.format("%.20f",result);
        System.out.printf(formattedResult);
    }
}