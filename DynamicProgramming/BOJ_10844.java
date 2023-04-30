import java.util.Scanner;

public class BOJ_10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // dp 초기화
        long[][] dp = new long[n+1][10];
        for (int i = 1;i <= 9;i++){
            dp[1][i] = 1;
        }

        // dp 계산(해당 자릿수의 개수)
        for (int i = 2;i<= n;i++){
            for (int j = 0;j<=9;j++){
                if(j==0){
                    dp[i][j] = dp[i-1][1];
                } else if(j==9){
                    dp[i][j] = dp[i-1][8];
                } else {
                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j+1];
                }
                dp[i][j] %= 1000000000;
            }
        }

        // 개수 총합
        long sum = 0;
        for (int i=0;i<=9;i++){
            sum += dp[n][i];
        }
        System.out.println(sum%1000000000);
        sc.close();

    }
}
