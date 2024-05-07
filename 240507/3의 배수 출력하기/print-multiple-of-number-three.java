import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i = 1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i <= n) {
            if(i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}