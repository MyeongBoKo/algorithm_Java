import java.util.Scanner;

public class BOJ_1699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        // dp를 1의 제곱수의 합들로 초기화
        for (int i = 0;i <= n;i++) dp[i] = i;
        
        // 1의 경우 dp[1]을 제외하곤 최소값들의 합이 될 수 없기 때문에 제외하고 반복문 돌림
        for (int i = 2;i <= n;i++){
            for (int j = 2;j*j <= i;j++){
                dp[i] = Math.min(dp[i], dp[i-j*j]+1);
            }
        }
        System.out.println(dp[n]);
    }
}


