import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt=0,cnt1=0,cnt2=0;

        for(int i = 1; i <= n; i++) {
            if(i % 12 == 0) {
                cnt2++;
            } else if(i % 3 == 0) {
                cnt1++;
            } else if(i % 2 == 0) {
                cnt++;
            }
        }
        System.out.print(cnt + " " + cnt1 + " " + cnt2);
    }
}