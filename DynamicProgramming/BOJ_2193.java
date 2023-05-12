import java.util.Scanner;

public class BOJ_2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n 의 범위는 1 ~ 90인데, int 의 경우 46이면 초과하게 된다. 그래서 long 으로 그 범위 안으로 설정
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);

    }
}

/*
2자리 이상의 경우 앞의 두 자리는 10이 고정
3자리가 나오는 경우의 수를 보면 100, 101
4자리가 나오는 경우의 수는 1000, 1001, 1010 인데 앞의 고정된 수를 제외하고 보면,
뒤에 나오는 수는 3자리 경우의 수 값과 2자리 나오는 경우의 수 값과 같다.
즉, 이렇게 점화식은 dp[i] = dp[i-1] + dp[i-2]이 나오게 된다.
 */