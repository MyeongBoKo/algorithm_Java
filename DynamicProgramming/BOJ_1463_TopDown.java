import java.util.Scanner;

public class BOJ_1463_TopDown {
    static int[] dp;

    static int function(int n){
        // BaseCse
        if (n==1) return 0;
        if (dp[n] > 0){
            return dp[n];
        }
        // 1을 뺀 연산
        dp[n] = function(n-1) + 1;
        // 3으로 나누거나 2로 나눔
        if (n%2==0){
            dp[n] = Math.min(dp[n], function(n/2)+1);
        }
        if (n%3==0){
            dp[n] = Math.min(dp[n], function(n/3)+1);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        System.out.println(function(n));
    }
}
