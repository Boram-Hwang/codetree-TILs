import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        
        for(int i = 0; i < cnt; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = 0;

            for(int j = num1; j <= num2; j++) {
                if(j % 2 == 0) {
                    result += j;
                }
            }
            System.out.println(result);
        }
    }
}