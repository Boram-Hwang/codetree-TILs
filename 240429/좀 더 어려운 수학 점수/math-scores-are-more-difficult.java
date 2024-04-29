import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        if(a1 > a2) {
            System.out.println("A");
        } else if(a1 == a2) {
            if(b1 > b2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
        else {
            System.out.println("B");
        }


    }
}