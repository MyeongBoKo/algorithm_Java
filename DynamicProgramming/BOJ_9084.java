import java.util.Scanner;

public class BOJ_9084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] coins = new int[n];
            for (int i = 0;i < n;i++){
                coins[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] dp = new int[m+1];
            dp[0] = 1;
            for (int i = 0;i<n;i++){
                for (int j = coins[i];j<=m;j++){
                    dp[j] += dp[j-coins[i]];
                }
            }
            System.out.println(dp[m]);
        }
        sc.close();
    }
}