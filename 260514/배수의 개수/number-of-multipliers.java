import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int result1 = 0;
        int cnt = 10;

        while(cnt > 0) {
            int a = sc.nextInt();

            if(a % 3 == 0 && a % 5 == 0) {
                result++;
                result1++;
            }else if(a % 5 == 0) {
                result1++;
            }else if(a % 3 == 0) {
                result++;
            }
            cnt--;
        }
        System.out.printf("%d %d", result, result1);
    }
}