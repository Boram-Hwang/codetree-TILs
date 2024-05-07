import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i = 3;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i <= n) {
            System.out.print(i + " ");
            i+=3;
        }
    }
}