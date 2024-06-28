import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 3;
        while(i > 0) {
            int a = sc.nextInt();

            if(a % 2 == 0) {
                System.out.println(a / 2);
                i--;
            }
            
        }
    }
}