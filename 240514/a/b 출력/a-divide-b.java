import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // double result = (double)a/b;
        // String formattedResult = String.format("%.20f",result);
        // System.out.printf(formattedResult);
        // 정수부분 출력
        System.out.print(a/b + ".");
        
        // a를 b로 나눈 나머지를 시작으로
        // 소수점 자리를 하나씩 계산
        a %= b;
        for(int i = 0; i< 20; i++) {
            // 나머지에 10 곱한 값을 기준으로
            // b로 나누었을 떄의 몫을 구해줌
            a *= 10;
            System.out.print(a/b);

            // a를 b로 나눈 나머지를 게속 갱신
            a %= b;
        }
    }
}