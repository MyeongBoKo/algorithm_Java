import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2193_TopDown {
    static long[] dp;

    static long function(int n){
        // BaseCase
        if (n==1 || n==2) return 1;
        // 이미 계산했을 경우
        if (dp[n] != -1){
            return dp[n];
        }
        dp[n] = function(n-1) + function(n-2);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new long[n+1];
        Arrays.fill(dp, -1);

        long result = function(n);
        System.out.println(result);
    }
}
