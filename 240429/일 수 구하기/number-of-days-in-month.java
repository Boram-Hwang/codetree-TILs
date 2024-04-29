import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n == 2) {
            System.out.println(28);
        } else if ( n < 9  && n % 2 == 0) {
            if(n == 8) {
                System.out.println(31);
            } else {
                System.out.println(30);
            }
        } else if (n >= 9  && n % 2 == 0) {
            System.out.println(30);
        }
        else {
            System.out.println(31);
        }
    }
}