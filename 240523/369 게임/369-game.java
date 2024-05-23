import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // for(int i = 1; i <= n; i++) {
        //     if(i% 3 == 0 || i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
        //         System.out.print(0 + " ");
        //     }else {
        //         System.out.print(i + " ");
        //     }
        // }

        // for(int i = 1; i <= n; i++) {
        //     boolean s = false;

        //     if(i % 3 == 0)
        //         s = true;
            
        //     int num = i;

        //     while(num > 0) {
        //         int lastDigit = num % 10;
        //         if(lastDigit == 3 || lastDigit == 6 || lastDigit == 9) {
        //             s = true;
        //             break;
        //         }

        //         num /= 10;
        //     }

        //     if(s) {
        //         System.out.print(0 + " ");
        //     } else {
        //         System.out.print(i + " ");
        //     }

        // }

        for (int i = 1; i <= n; i++) {
            boolean satisfied = false;
            // 3의 배수인지 확인
            if(i % 3 == 0)
                satisfied = true;
            // 각 자리수를 조사하며
            // 3, 6, 9 중 하나라도 있는지 확인
            int num = i;
            // 맨 뒤에 자리부터 하나씩 조회합니다.
            while(num > 0) {
                // 가장 끝자리가 3, 6, 9 중에 하나라면
                // statified는 true 입니다.
                int lastDigit = num % 10;
                if(lastDigit == 3 || lastDigit == 6 || lastDigit == 9) {
                    satisfied = true;
                    break;
                }

                // 10으로 나눈 몫을 다시 넣어주어
                // 가장 끝자리에 그 다음 숫자가 적히도록 합니다.
                num /= 10;
            }

            if (satisfied) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}