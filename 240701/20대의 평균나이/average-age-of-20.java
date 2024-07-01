import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        double avg;
        while(true) {
            int a = sc.nextInt();
            
            
            if(a >= 30 || a < 20) {
                break;
            }else {
                sum += a;
                cnt++; 
            }
        }
        avg = (double)sum / cnt;
        System.out.printf("%.2f",avg);
    }
}