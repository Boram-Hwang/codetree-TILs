import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, temp, sum=0;
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }


        for(int i = a; i <= b; i++) {
            if(i % 5 == 0) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}