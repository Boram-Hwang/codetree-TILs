import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int s1 = sc.nextInt();

        if(s >= 90 && s1 >= 90) {
            if(s >= 95 || s1 >= 95){
                System.out.println(100000);
            } else if (s>=90||s1>=90){
                System.out.println(50000);
            }
        }else{
            System.out.println(0);
        }
    }
}