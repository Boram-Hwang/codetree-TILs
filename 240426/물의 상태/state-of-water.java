import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();

        if(tmp < 0){
            System.out.println("ice");
        } else if (tmp >= 100) {
            System.out.println("vapor");
        } else {
            System.out.println("water");
        }
    }
}