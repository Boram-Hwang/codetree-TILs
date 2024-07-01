import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;


        int a = sc.nextInt();
        while (a != 1) {
            if(a % 2 == 0) {
                a /= 2;
            } else {
                a = (a * 3) + 1;
            }
            cnt++;
        }
        System.out.println(cnt);

    }
}