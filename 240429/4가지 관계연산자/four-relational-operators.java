import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        intValue(a >= b);
        intValue(a > b);
        intValue(a <= b);
        intValue(a < b);

        // if(a >= b) {
        //     System.out.println(1);
        // }else {
        //     System.out.println(0);
        // }

        // if(a > b) {
        //     System.out.println(1);
        // }else {
        //     System.out.println(0);
        // }

        // if(a <= b) {
        //     System.out.println(1);
        // }else {
        //     System.out.println(0);
        // }

        // if(a < b) {
        //     System.out.println(1);
        // }else {
        //     System.out.println(0);
        // }
    }

    public static void intValue(boolean value) {
        if(value == true) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}