import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};

        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0);

        int cnt = 0;

        for(String str : arr) {
            if(str.charAt(2) == c || str.charAt(3) == c) {
                System.out.println(str);
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}