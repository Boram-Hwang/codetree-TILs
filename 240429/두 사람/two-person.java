import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a_age = sc.nextInt();
        String a_gen = sc.next();
        int b_age = sc.nextInt();
        String b_gen = sc.next();

        if(a_age >= 19 && a_gen.equals("M") || b_age >= 19 && b_gen.equals("M")) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}