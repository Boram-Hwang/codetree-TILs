import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0, count = 0 , a;
        double avg;
        for(int i = 1; i <= 10; i++) {
            a = sc.nextInt();

            if(a >= 0 && a <= 200) {
                sum += a;
                count++;
            }
            
        }

        avg = (double)sum/count;

        System.out.printf("%d %.1f", sum , avg);
    }
}