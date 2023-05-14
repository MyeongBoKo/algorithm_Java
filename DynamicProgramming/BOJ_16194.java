import java.util.Arrays;
import java.util.Scanner;

public class BOJ_16194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 가격(개수 당)
        int[] price = new int[n+1];
        for (int i = 1;i <= n;i++){
            price[i] = sc.nextInt();
        }
        // 해당 개수 당 가지는 최소 가격
        int[] dp = new int[n+1];
        Arrays.fill(dp, 1001);
        for (int i = 1;i<=n;i++){
            for (int j = 1; j <= i;j++){
                dp[i]=Math.min(dp[i], dp[i-j]+price[j]);
            }
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
