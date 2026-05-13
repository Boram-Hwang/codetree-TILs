import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= 100; i++) {
            result += i;
            if(result >= a) {
                System.out.print(i);
                break;
            }
        }
        
    }
}