import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int t;
        

        if(b > a) {
            t = a;
            a = b;
            b = t;
        }

        for(; a >= b; a--) {
            System.out.print(a + " ");
        } 
    }
}