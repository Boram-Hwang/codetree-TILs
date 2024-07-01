import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        while(true) {
            for(int i = 0; i<3; i++) {
                arr[i] = sc.next().toString();
            }
            int width = Integer.parseInt(arr[0]);
            int height = Integer.parseInt(arr[1]);
            System.out.println(width * height);
            if(arr[2].equals("C")) {
                break;
            }            
        }
    }
}