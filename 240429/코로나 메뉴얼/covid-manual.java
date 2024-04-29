import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yn1 = sc.next();
        int temp1 = sc.nextInt();
        String yn2 = sc.next();
        int temp2 = sc.nextInt();
        String yn3 = sc.next();
        int temp3 = sc.nextInt();
        int cnt = 0;

        if(yn1.equals("Y")){
            if(temp1 >= 37){
                cnt++;
            }
        }
        if(yn2.equals("Y")){
            if(temp2 >= 37){
                cnt++;
            }
        }
        if(yn3.equals("Y")){
            if(temp3 >= 37){
                cnt++;
            }
        }

        if(cnt >= 2) {
            System.out.println("E");
        }else {
            System.out.println("N");
        }


    }
}