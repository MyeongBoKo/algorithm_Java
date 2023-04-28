import java.util.Scanner;

public class BOJ_2294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coin = new int[n];
        for (int i = 0;i < n;i++){
            coin[i] = sc.nextInt();
        }
        // 동전 조합 수
        int[] dp = new int[k+1];
        dp[0] = 1;
        // 동전 조합을 만드는데 사용한 동전 수(min)
        int[] arr = new int[k+1];
        for (int i = 0;i<=k;i++){
            arr[i] = i;
        }

        for (int i = 0;i < n;i++){
            for (int j = coin[i];j<=k;j++){
                dp[j] += dp[j-coin[i]];
                arr[j] = Math.min(arr[j], arr[j-coin[i]]+1);
            }
        }
        if (dp[k] != 0) System.out.println(arr[k]);
        else System.out.println(-1);
        sc.close();
    }
}
