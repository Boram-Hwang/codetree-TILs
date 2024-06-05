import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 1;
        int number = 0;
        for(int i = 1; i <= 10; i++) {
            result *= i;

            if(result >= n) {
                number = i;
                break;
            }
        }
        System.out.println(number);
    }
}