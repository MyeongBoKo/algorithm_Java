import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11726_TopDown {
    static int[] dp;

    static int topDown(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        if (dp[n] != -1){
            return dp[n];
        }
        dp[n] = (topDown(n-1) + topDown(n-2))%10007;
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = topDown(n);
        System.out.println(ans);
    }
}
